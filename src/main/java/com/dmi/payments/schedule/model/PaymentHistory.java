package com.dmi.payments.schedule.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment_history__c")
public class PaymentHistory {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "sfid")
	private String sfid;
	
	@Column(name="is_callback_required__c")
	private boolean  is_Callback_Required;
	
	@Column(name = "net_payment__c")
	private Double net_Payment;
	
	@Column(name = "penal_interest__c")
	private Double penal_Interest;
	
	@Column(name = "need_to_delete__c")
	private boolean need_To_Delete;
	
	@Column(name = "closingprincipalbal_as_per_books__c")
	private Double closingPrincipalBal_As_Per_Books;
	
	@Column(name = "is_updated__c")
	private boolean is_Updated;
	
	@Column(name = "other_charges_amount__c")
	private Double other_Charges_Amount;

	@Column(name="payment_date__c")
	private Date  payment_Date;
	
	@Column(name = "bounce_charges__c")
	private Double bounce_Charges;
	
	@Column(name="other_charges_type__c")
	private String other_Charges_Type;
	
	@Column(name="createdbyid")
	private String createdById;
	
	@Column(name = "principalpmt__c")
	private Double principalPmt;
	
	@Column(name="reconciliation_date__c")
	private Date  reconciliation_Date;
	
	@Column(name="refund_reason__c")
	private String refund_Reason;
	
	@Column(name = "access_payment__c")
	private Double access_Payment;
	
	@Column(name = "closingprincipalbal_dhfc__c")
	private Double closingPrincipalBal_Dhfc;
	
	@Column(name="refund_utr__c")
	private String refund_Utr;
	
	@Column(name = "interestpmt__c")
	private Double interestPmt;
	
	@Column(name = " createddate")
	private Date  createdDate;
	
	@Column(name = "date__c")
	private Date date;
	
	@Column(name="bank_remarks__c")
	private String bank_Remarks;
	
	@Column(name = "tpu_name__c")
	private String tpu_Name;
	
	@Column(name = "ach_amount__c")
	private Double ach_Amount;
	
	@Column(name = "status__c")
	private String status;
	
	@Column(name = "payment_reference__c")
	private String payment_Reference;
	
	@Column(name = "net_payment_f_w_o_charges__c")
	private Double net_Payment_F_W_O_Charges;
	
	@Column(name = "remarks__c")
	private String remarks;
	
	@Column(name = "payment_type__c")
	private String payment_Type;
	
	@Column(name = "systemmodstamp")
	private Date systemModStamp;
	
	@Column(name = "opportunity__c")
	private String opportunity;
	
	@Column(name = "isdeleted")
	private boolean isDeleted;

	@Column(name = "closingprincipalbal__c")
	private Double closingPrincipalBal;
	
	@Column(name = "isreportedtoaccount__c")
	private boolean isReportedToAccount;
	
	@Column(name = "refund_date__c")
	private Date refund_Date;
	
	@Column(name = "preclosure__c")
	private boolean preclosure;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "is_prepayment__c")
	private boolean is_Prepayment;
	
	@Column(name = "isreportedtomule__c")
	private boolean isReportedToMule;
	
	@Column(name = " mode_of_payment__c")
	private String  mode_Of_Payment;
	
	@Column(name = "processing_fee__c")
	private Double processing_Fee;
	
	@Column(name = " cp_external_id__c")
	private String  cp_External_Id;
	
	@Column(name = "is_partpayment__c")
	private boolean is_PartPayment;
	
	@Column(name = "refund_amount__c")
	private Double refund_Amount;
	
	@Column(name = "tds__c")
	private Double tds;
	
	@Column(name = " payment_schedules__c")
	private String  payment_Schedules;

	public PaymentHistory() {
		
	}
	
	public PaymentHistory(Long id, String sfid, boolean is_Callback_Required, Double net_Payment, Double penal_Interest,
			boolean need_To_Delete, Double closingPrincipalBal_As_Per_Books, boolean is_Updated,
			Double other_Charges_Amount, Date payment_Date, Double bounce_Charges, String other_Charges_Type,
			String createdById, Double principalPmt, Date reconciliation_Date, String refund_Reason,
			Double access_Payment, Double closingPrincipalBal_Dhfc, String refund_Utr, Double interestPmt,
			Date createdDate, Date date, String bank_Remarks, String tpu_Name, Double ach_Amount, String status,
			String payment_Reference, Double net_Payment_F_W_O_Charges, String remarks, String payment_Type,
			Date systemModStamp, String opportunity, boolean isDeleted, Double closingPrincipalBal,
			boolean isReportedToAccount, Date refund_Date, boolean preclosure, String name, boolean is_Prepayment,
			boolean isReportedToMule, String mode_Of_Payment, Double processing_Fee, String cp_External_Id,
			boolean is_PartPayment, Double refund_Amount, Double tds, String payment_Schedules) {
		super();
		this.id = id;
		this.sfid = sfid;
		this.is_Callback_Required = is_Callback_Required;
		this.net_Payment = net_Payment;
		this.penal_Interest = penal_Interest;
		this.need_To_Delete = need_To_Delete;
		this.closingPrincipalBal_As_Per_Books = closingPrincipalBal_As_Per_Books;
		this.is_Updated = is_Updated;
		this.other_Charges_Amount = other_Charges_Amount;
		this.payment_Date = payment_Date;
		this.bounce_Charges = bounce_Charges;
		this.other_Charges_Type = other_Charges_Type;
		this.createdById = createdById;
		this.principalPmt = principalPmt;
		this.reconciliation_Date = reconciliation_Date;
		this.refund_Reason = refund_Reason;
		this.access_Payment = access_Payment;
		this.closingPrincipalBal_Dhfc = closingPrincipalBal_Dhfc;
		this.refund_Utr = refund_Utr;
		this.interestPmt = interestPmt;
		this.createdDate = createdDate;
		this.date = date;
		this.bank_Remarks = bank_Remarks;
		this.tpu_Name = tpu_Name;
		this.ach_Amount = ach_Amount;
		this.status = status;
		this.payment_Reference = payment_Reference;
		this.net_Payment_F_W_O_Charges = net_Payment_F_W_O_Charges;
		this.remarks = remarks;
		this.payment_Type = payment_Type;
		this.systemModStamp = systemModStamp;
		this.opportunity = opportunity;
		this.isDeleted = isDeleted;
		this.closingPrincipalBal = closingPrincipalBal;
		this.isReportedToAccount = isReportedToAccount;
		this.refund_Date = refund_Date;
		this.preclosure = preclosure;
		this.name = name;
		this.is_Prepayment = is_Prepayment;
		this.isReportedToMule = isReportedToMule;
		this.mode_Of_Payment = mode_Of_Payment;
		this.processing_Fee = processing_Fee;
		this.cp_External_Id = cp_External_Id;
		this.is_PartPayment = is_PartPayment;
		this.refund_Amount = refund_Amount;
		this.tds = tds;
		this.payment_Schedules = payment_Schedules;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSfid() {
		return sfid;
	}

	public void setSfid(String sfid) {
		this.sfid = sfid;
	}

	public boolean isIs_Callback_Required() {
		return is_Callback_Required;
	}

	public void setIs_Callback_Required(boolean is_Callback_Required) {
		this.is_Callback_Required = is_Callback_Required;
	}

	public Double getNet_Payment() {
		return net_Payment;
	}

	public void setNet_Payment(Double net_Payment) {
		this.net_Payment = net_Payment;
	}

	public Double getPenal_Interest() {
		return penal_Interest;
	}

	public void setPenal_Interest(Double penal_Interest) {
		this.penal_Interest = penal_Interest;
	}

	public boolean isNeed_To_Delete() {
		return need_To_Delete;
	}

	public void setNeed_To_Delete(boolean need_To_Delete) {
		this.need_To_Delete = need_To_Delete;
	}

	public Double getClosingPrincipalBal_As_Per_Books() {
		return closingPrincipalBal_As_Per_Books;
	}

	public void setClosingPrincipalBal_As_Per_Books(Double closingPrincipalBal_As_Per_Books) {
		this.closingPrincipalBal_As_Per_Books = closingPrincipalBal_As_Per_Books;
	}

	public boolean isIs_Updated() {
		return is_Updated;
	}

	public void setIs_Updated(boolean is_Updated) {
		this.is_Updated = is_Updated;
	}

	public Double getOther_Charges_Amount() {
		return other_Charges_Amount;
	}

	public void setOther_Charges_Amount(Double other_Charges_Amount) {
		this.other_Charges_Amount = other_Charges_Amount;
	}

	public Date getPayment_Date() {
		return payment_Date;
	}

	public void setPayment_Date(Date payment_Date) {
		this.payment_Date = payment_Date;
	}

	public Double getBounce_Charges() {
		return bounce_Charges;
	}

	public void setBounce_Charges(Double bounce_Charges) {
		this.bounce_Charges = bounce_Charges;
	}

	public String getOther_Charges_Type() {
		return other_Charges_Type;
	}

	public void setOther_Charges_Type(String other_Charges_Type) {
		this.other_Charges_Type = other_Charges_Type;
	}

	public String getCreatedById() {
		return createdById;
	}

	public void setCreatedById(String createdById) {
		this.createdById = createdById;
	}

	public Double getPrincipalPmt() {
		return principalPmt;
	}

	public void setPrincipalPmt(Double principalPmt) {
		this.principalPmt = principalPmt;
	}

	public Date getReconciliation_Date() {
		return reconciliation_Date;
	}

	public void setReconciliation_Date(Date reconciliation_Date) {
		this.reconciliation_Date = reconciliation_Date;
	}

	public String getRefund_Reason() {
		return refund_Reason;
	}

	public void setRefund_Reason(String refund_Reason) {
		this.refund_Reason = refund_Reason;
	}

	public Double getAccess_Payment() {
		return access_Payment;
	}

	public void setAccess_Payment(Double access_Payment) {
		this.access_Payment = access_Payment;
	}

	public Double getClosingPrincipalBal_Dhfc() {
		return closingPrincipalBal_Dhfc;
	}

	public void setClosingPrincipalBal_Dhfc(Double closingPrincipalBal_Dhfc) {
		this.closingPrincipalBal_Dhfc = closingPrincipalBal_Dhfc;
	}

	public String getRefund_Utr() {
		return refund_Utr;
	}

	public void setRefund_Utr(String refund_Utr) {
		this.refund_Utr = refund_Utr;
	}

	public Double getInterestPmt() {
		return interestPmt;
	}

	public void setInterestPmt(Double interestPmt) {
		this.interestPmt = interestPmt;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBank_Remarks() {
		return bank_Remarks;
	}

	public void setBank_Remarks(String bank_Remarks) {
		this.bank_Remarks = bank_Remarks;
	}

	public String getTpu_Name() {
		return tpu_Name;
	}

	public void setTpu_Name(String tpu_Name) {
		this.tpu_Name = tpu_Name;
	}

	public Double getAch_Amount() {
		return ach_Amount;
	}

	public void setAch_Amount(Double ach_Amount) {
		this.ach_Amount = ach_Amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPayment_Reference() {
		return payment_Reference;
	}

	public void setPayment_Reference(String payment_Reference) {
		this.payment_Reference = payment_Reference;
	}

	public Double getNet_Payment_F_W_O_Charges() {
		return net_Payment_F_W_O_Charges;
	}

	public void setNet_Payment_F_W_O_Charges(Double net_Payment_F_W_O_Charges) {
		this.net_Payment_F_W_O_Charges = net_Payment_F_W_O_Charges;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getPayment_Type() {
		return payment_Type;
	}

	public void setPayment_Type(String payment_Type) {
		this.payment_Type = payment_Type;
	}

	public Date getSystemModStamp() {
		return systemModStamp;
	}

	public void setSystemModStamp(Date systemModStamp) {
		this.systemModStamp = systemModStamp;
	}

	public String getOpportunity() {
		return opportunity;
	}

	public void setOpportunity(String opportunity) {
		this.opportunity = opportunity;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Double getClosingPrincipalBal() {
		return closingPrincipalBal;
	}

	public void setClosingPrincipalBal(Double closingPrincipalBal) {
		this.closingPrincipalBal = closingPrincipalBal;
	}

	public boolean isReportedToAccount() {
		return isReportedToAccount;
	}

	public void setReportedToAccount(boolean isReportedToAccount) {
		this.isReportedToAccount = isReportedToAccount;
	}

	public Date getRefund_Date() {
		return refund_Date;
	}

	public void setRefund_Date(Date refund_Date) {
		this.refund_Date = refund_Date;
	}

	public boolean isPreclosure() {
		return preclosure;
	}

	public void setPreclosure(boolean preclosure) {
		this.preclosure = preclosure;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIs_Prepayment() {
		return is_Prepayment;
	}

	public void setIs_Prepayment(boolean is_Prepayment) {
		this.is_Prepayment = is_Prepayment;
	}

	public boolean isReportedToMule() {
		return isReportedToMule;
	}

	public void setReportedToMule(boolean isReportedToMule) {
		this.isReportedToMule = isReportedToMule;
	}

	public String getMode_Of_Payment() {
		return mode_Of_Payment;
	}

	public void setMode_Of_Payment(String mode_Of_Payment) {
		this.mode_Of_Payment = mode_Of_Payment;
	}

	public Double getProcessing_Fee() {
		return processing_Fee;
	}

	public void setProcessing_Fee(Double processing_Fee) {
		this.processing_Fee = processing_Fee;
	}

	public String getCp_External_Id() {
		return cp_External_Id;
	}

	public void setCp_External_Id(String cp_External_Id) {
		this.cp_External_Id = cp_External_Id;
	}

	public boolean isIs_PartPayment() {
		return is_PartPayment;
	}

	public void setIs_PartPayment(boolean is_PartPayment) {
		this.is_PartPayment = is_PartPayment;
	}

	public Double getRefund_Amount() {
		return refund_Amount;
	}

	public void setRefund_Amount(Double refund_Amount) {
		this.refund_Amount = refund_Amount;
	}

	public Double getTds() {
		return tds;
	}

	public void setTds(Double tds) {
		this.tds = tds;
	}

	public String getPayment_Schedules() {
		return payment_Schedules;
	}

	public void setPayment_Schedules(String payment_Schedules) {
		this.payment_Schedules = payment_Schedules;
	}

	@Override
	public String toString() {
		return "PaymentHistory [id=" + id + ", sfid=" + sfid + ", is_Callback_Required=" + is_Callback_Required
				+ ", net_Payment=" + net_Payment + ", penal_Interest=" + penal_Interest + ", need_To_Delete="
				+ need_To_Delete + ", closingPrincipalBal_As_Per_Books=" + closingPrincipalBal_As_Per_Books
				+ ", is_Updated=" + is_Updated + ", other_Charges_Amount=" + other_Charges_Amount + ", payment_Date="
				+ payment_Date + ", bounce_Charges=" + bounce_Charges + ", other_Charges_Type=" + other_Charges_Type
				+ ", createdById=" + createdById + ", principalPmt=" + principalPmt + ", reconciliation_Date="
				+ reconciliation_Date + ", refund_Reason=" + refund_Reason + ", access_Payment=" + access_Payment
				+ ", closingPrincipalBal_Dhfc=" + closingPrincipalBal_Dhfc + ", refund_Utr=" + refund_Utr
				+ ", interestPmt=" + interestPmt + ", createdDate=" + createdDate + ", date=" + date + ", bank_Remarks="
				+ bank_Remarks + ", tpu_Name=" + tpu_Name + ", ach_Amount=" + ach_Amount + ", status=" + status
				+ ", payment_Reference=" + payment_Reference + ", net_Payment_F_W_O_Charges="
				+ net_Payment_F_W_O_Charges + ", remarks=" + remarks + ", payment_Type=" + payment_Type
				+ ", systemModStamp=" + systemModStamp + ", opportunity=" + opportunity + ", isDeleted=" + isDeleted
				+ ", closingPrincipalBal=" + closingPrincipalBal + ", isReportedToAccount=" + isReportedToAccount
				+ ", refund_Date=" + refund_Date + ", preclosure=" + preclosure + ", name=" + name + ", is_Prepayment="
				+ is_Prepayment + ", isReportedToMule=" + isReportedToMule + ", mode_Of_Payment=" + mode_Of_Payment
				+ ", processing_Fee=" + processing_Fee + ", cp_External_Id=" + cp_External_Id + ", is_PartPayment="
				+ is_PartPayment + ", refund_Amount=" + refund_Amount + ", tds=" + tds + ", payment_Schedules="
				+ payment_Schedules + "]";
	}	
	
}
