package com.dmi.payments.schedule.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmi.payments.schedule.DmiPaymentsScheduleApplication;
import com.dmi.payments.schedule.dao.TempPaymentUploadDao;
import com.dmi.payments.schedule.model.CurrentFaces;
import com.dmi.payments.schedule.model.PaymentHistory;
import com.dmi.payments.schedule.model.TempPaymentUpload;
import com.dmi.payments.schedule.model.TempPaymentsFacade;
import com.dmi.payments.schedule.repository.OpportunityRepository;
import com.dmi.payments.schedule.repository.PaymentHistoryRepository;
import com.dmi.payments.schedule.repository.PaymentScheduleRepositiry;
import com.dmi.payments.schedule.repository.TempPaymentUploadRepository;

@Service
public class TempPaymentUploadServiceImpl implements TempPaymentUploadService {

	@Autowired
	TempPaymentUploadRepository tempPaymentRepository;

	@Autowired
	PaymentHistoryRepository paymentHistoryRepository;

	@Autowired
	OpportunityRepository opportunityRepository;

	@Autowired
	PaymentScheduleRepositiry scheduleRepository;

	@Autowired
	TempPaymentUploadDao tempPaymentUploadDao;

	private static final Logger LOGGER=LoggerFactory.getLogger(TempPaymentUploadServiceImpl.class);
	
	@Override
	//@Transactional
	public String createPaymentHistory(String ticketId) {

		TempPaymentsFacade facade = tempPaymentUploadDao.findAllTPUsByTicketNo(ticketId);
		List<PaymentHistory> paymentHistories = createPaymentHistoryByTPU(facade);
		boolean status = true;
		for (PaymentHistory paymentHistory : paymentHistories) {
			try {
				paymentHistory = paymentHistoryRepository.save(paymentHistory);
				if (paymentHistory.getId() != null) {
					for (TempPaymentUpload tpuRecord : facade.getTempPaymentList()) {
						if (tpuRecord.getName().equals(paymentHistory.getTpu_Name())) {
							status=tempPaymentUploadDao.updateTPUStatus(tpuRecord.getName());
						}
					}
				}
			} catch (Exception e) {
				status = false;
				LOGGER.error("exception during history creation" + e.getMessage());
			}
		}
		if (status)
			return "Success";
		else
			return "failed to Insert Record";
	}

	public List<PaymentHistory> createPaymentHistoryByTPU(TempPaymentsFacade tempPayfacade) {

		List<PaymentHistory> paymentHistoryItems = null;
		List<String> cflloans=null;
		if (tempPayfacade.getTempPaymentList() != null) {
			paymentHistoryItems = new ArrayList<PaymentHistory>();
			cflloans=new ArrayList<>();
			for (TempPaymentUpload tempPaymentUpload : tempPayfacade.getTempPaymentList()) {
				PaymentHistory paymentHistory = new PaymentHistory();
				if (tempPaymentUpload.getType_of_loan().equalsIgnoreCase("TL")) {
					paymentHistory.setTpu_Name(tempPaymentUpload.getName());
					paymentHistory.setReconciliation_Date(tempPaymentUpload.getReconciliation_Date());
					paymentHistory.setDate(tempPaymentUpload.getPayment_Date_F());
					paymentHistory.setPayment_Date(tempPaymentUpload.getPayment_Date_F());
					paymentHistory.setMode_Of_Payment(tempPaymentUpload.getMode_of_Payment());
					paymentHistory.setStatus(tempPaymentUpload.getStatus());
					paymentHistory.setBank_Remarks(tempPaymentUpload.getReason());
					paymentHistory.setBounce_Charges(tempPaymentUpload.getBounce_charges());
					paymentHistory.setOpportunity(tempPaymentUpload.getOpportunity_Name());
					paymentHistory.setCp_External_Id(tempPaymentUpload.getTransaction_Id());
					paymentHistory.setPayment_Reference(tempPaymentUpload.getPayment_Reference());
					paymentHistory.setAch_Amount(tempPaymentUpload.getAmount_Rececived());
					for (CurrentFaces cf : tempPayfacade.getCurrentFaces()) {
						if (cf.getTpuname().equals(tempPaymentUpload.getName())) {
							paymentHistory.setClosingPrincipalBal(cf.getCurrent_Face());
							paymentHistory.setClosingPrincipalBal_As_Per_Books(cf.getCurrent_Face());
						}
					}
					paymentHistoryItems.add(paymentHistory);
				}
				else if(tempPaymentUpload.getType_of_loan().equalsIgnoreCase("CFL")) {
					cflloans.add(tempPaymentUpload.getOpportunity_Name());
				}
			}
		}
		if(cflloans!=null&&cflloans.size()>0) {
			TempPaymentsFacade cflchildloans=tempPaymentUploadDao.findAllTPUsByParentOpportunity(cflloans);
			createPaymentHistoryByTPU(cflchildloans);
		}
		return paymentHistoryItems;
	}
}
