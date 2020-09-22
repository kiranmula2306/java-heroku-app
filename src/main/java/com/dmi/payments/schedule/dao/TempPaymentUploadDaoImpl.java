package com.dmi.payments.schedule.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dmi.payments.schedule.model.CurrentFaces;
import com.dmi.payments.schedule.model.Opportunity;
import com.dmi.payments.schedule.model.PaymentHistory;
import com.dmi.payments.schedule.model.TempPaymentUpload;
import com.dmi.payments.schedule.model.TempPaymentsFacade;
import com.dmi.payments.schedule.service.TempPaymentUploadServiceImpl;

@Repository
public class TempPaymentUploadDaoImpl implements TempPaymentUploadDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	private static final Logger LOGGER = LoggerFactory.getLogger(TempPaymentUploadDaoImpl.class);

	public TempPaymentsFacade findAllTPUsByTicketNo(String ticketNo) {

		String query = " SELECT tpu.id, tpu.Transaction_ID__c, tpu.Interest__c, tpu.Code_Version__c, tpu.Principal__c, tpu.type_of_loan__c, tpu.status__c, "
				+ "	tpu.is_failed__c,tpu.Penal_Interest__c, tpu.Payment_Reference__c, tpu.Bounce_Charges__c, tpu.opportunity__c, tpu.reason__c, "
				+ " tpu.Reconciliation_DateF__c, tpu.Payment_Date_F__c, tpu.ACH_Transaction_Code__c, tpu.Amount_Rececived__c, "
				+ " tpu.Account_Holder_s_Name__c, tpu.Name,tpu.Beneficiary_Bank_Account_No__c, tpu.Destination_Account_Type__c, tpu.umrn__c, "
				+ " tpu.Destination_Bank_IFSC_MICR__c, tpu.Mode_of_Payment__c, tpu.Opportunity_Name__c, tpu.Payment_Clearance_Date__c, tpu.Payment_Date__c, "
				+ "	opp.current_face__c, opp.name, opp.parent_opportunity__c, opp.stage_name "
				+ " FROM temp_payment_upload__c tpu INNER JOIN opportunity opp "
				+ " ON tpu.opportunity_name__c = opp.name where tpu.isadjustment__c=false and tpu.insertThroughTrigger__c=false and status__c='BOUNCE' "
				+ " and tpu.ticket_no__c=? ";

		List<Map<String, Object>> tpuRecords = jdbcTemplate.queryForList(query, ticketNo);

		TempPaymentsFacade tempPaymentFacade = getTempPaymentFacade(tpuRecords);
		return tempPaymentFacade;
	}

	@Override
	public boolean updateTPUStatus(String tpuId) {

		String query = "UPDATE temp_payment_upload__c SET status__c=?, isadjustment__c=true where name=?";
		String BOUNCE_APPEND_DATE="BOUNCE"+new Date();
		int tpuUpdateStatus = jdbcTemplate.update(query, BOUNCE_APPEND_DATE,tpuId);
		boolean tpuStatus = false;

		if (tpuUpdateStatus == 1) {
			tpuStatus = true;
		} else {
			tpuStatus = false;
		}
		return tpuStatus;
	}

	public TempPaymentsFacade findAllTPUsByParentOpportunity(List<String> opportunityNames) {

		String query = " SELECT tpu.id, tpu.Transaction_ID__c, tpu.Interest__c, tpu.Code_Version__c, tpu.Principal__c, tpu.type_of_loan__c, tpu.status__c, "
				+ "	tpu.is_failed__c,tpu.Penal_Interest__c, tpu.Payment_Reference__c, tpu.Bounce_Charges__c, tpu.opportunity__c, tpu.reason__c, "
				+ " tpu.Reconciliation_DateF__c, tpu.Payment_Date_F__c, tpu.ACH_Transaction_Code__c, tpu.Amount_Rececived__c, "
				+ " tpu.Account_Holder_s_Name__c, tpu.Name,tpu.Beneficiary_Bank_Account_No__c, tpu.Destination_Account_Type__c, tpu.umrn__c, "
				+ " tpu.Destination_Bank_IFSC_MICR__c, tpu.Mode_of_Payment__c, tpu.Opportunity_Name__c, tpu.Payment_Clearance_Date__c, tpu.Payment_Date__c, "
				+ "	opp.current_face__c, opp.name, opp.parent_opportunity__c, opp.stage_name "
				+ " FROM temp_payment_upload__c tpu INNER JOIN opportunity opp "
				+ " ON tpu.opportunity_name__c = opp.name where tpu.isadjustment__c=false and tpu.insertThroughTrigger__c=false and status__c='BOUNCE' "
				+ " and opportunity_name__c IN (:opportunityIds) ";

		MapSqlParameterSource paramMap = new MapSqlParameterSource();
		paramMap.addValue("opportunityIds", opportunityNames);
		List<Map<String, Object>> tpuRecords = namedParameterJdbcTemplate.queryForList(query, paramMap);

		TempPaymentsFacade tempPaymentFacade = getTempPaymentFacade(tpuRecords);
		return tempPaymentFacade;
	}

	private TempPaymentsFacade getTempPaymentFacade(List<Map<String, Object>> tpuRecords) {
		List<TempPaymentUpload> items;
		List<CurrentFaces> currentFaces;
		TempPaymentsFacade tempPaymentFacade = new TempPaymentsFacade();

		if (tpuRecords != null) {
			items = new ArrayList<TempPaymentUpload>();
			currentFaces = new ArrayList<CurrentFaces>();
			for (Map<String, Object> tpuRecord : tpuRecords) {
				TempPaymentUpload tempPaymentupload = new TempPaymentUpload();

				tempPaymentupload.setOpportunity_Name((String) tpuRecord.get("opportunity_name__c"));
				tempPaymentupload.setType_of_loan((String) tpuRecord.get("type_of_loan__c"));
				tempPaymentupload.setPayment_Date_F((Date) tpuRecord.get("Payment_Date_F__c"));
				tempPaymentupload.setReconciliation_Date((Date) tpuRecord.get("Payment_Date_F__c"));
				tempPaymentupload.setAmount_Rececived((Double) tpuRecord.get("Amount_Rececived__c"));
				tempPaymentupload.setMode_of_Payment((String) tpuRecord.get("Mode_of_Payment__c"));
				tempPaymentupload.setUmrn((String) tpuRecord.get("umrn__c"));
				tempPaymentupload.setStatus((String) tpuRecord.get("status__c"));
				tempPaymentupload.setOpportunity((String) tpuRecord.get("opportunity__c"));
				tempPaymentupload.setName((String) tpuRecord.get("name"));

				CurrentFaces currentFace = new CurrentFaces();
				currentFace.setCurrent_Face((Double) tpuRecord.get("current_face__c"));
				currentFace.setTpuname((String) tpuRecord.get("name"));
				currentFaces.add(currentFace);

				items.add(tempPaymentupload);

				tempPaymentFacade.setTempPaymentList(items);
				tempPaymentFacade.setCurrentFaces(currentFaces);
			}
		}
		return tempPaymentFacade;
	}

}
