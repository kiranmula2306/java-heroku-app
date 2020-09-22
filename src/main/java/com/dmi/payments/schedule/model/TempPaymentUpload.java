package com.dmi.payments.schedule.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "temp_payment_upload__c")
public class TempPaymentUpload {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "row_num__c")
	private Long row_num;
	
	@Column(name = "dataset_num__c")
	private String dataset_num;
	
	@Column(name = "sponsor_Bank_IFSC_MICR__c")
	private String sponsor_Bank_IFSC_MICR;

	@Column(name = "destination_Account_Type__c")
	private String destination_Account_Type;
	
	@Column(name = "transaction_Id__c")
	private String transaction_Id;
	
	@Column(name = "reconciliation_datef__c")
	private Date reconciliation_Date_F;
	
	@Column(name = "beneficiary_Bank_Account_No__c")
	private String beneficiary_Bank_Account_No;
	
	@Column(name = "return_code__c")
	private String return_code;
	
	@Column(name = "mode_of_payment__c")
	private String mode_of_Payment;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "account_Holder_s_Name__c")
	private String account_Holder_s_Name;
	
	@Column(name = "opportunity__c")
	private String opportunity;
	
	@Column(name = "opportunity_name__c")
	private String opportunity_Name;
	
	@Column(name = "isadjustment__c")
	private boolean isadjustment;
	
	@Column(name = "tdr_amount__c")
	private Double tdr_amount;
	
	@Column(name = "ticket_no__c")
	private String ticketNo;
	
	@Column(name = "umrn__c")
	private String umrn;

	@Column(name = "isdeleted")
	private boolean isdeleted;
	
	@Column(name = "type_of_loan__c ")
	private String type_of_loan;
	
	@Column(name = "systemmodstamp")
	private Timestamp systemmodstamp;
	
	@Column(name = "amount_Rececived__c")
	private Double amount_Rececived;
	
	@Column(name = "remarks__c")
	private String remarks;
	
	@Column(name = "is_failed__c")
	private boolean is_failed;
	
	@Column(name = "payment_Reference__c")
	private String payment_Reference;
	
	@Column(name = "status__c")
	private String status;
	
	@Column(name = "is_failed_reason__c")
	private String is_failed_reason;
	
	@Column(name = "actual_emi__c")
	private Double actual_emi;
	
	@Column(name = "payment_Date_f__c")
	private Date payment_Date_F;
	
	@Column(name = "principal__c")
	private String principal;
	
	@Column(name = "replication_id__c")
	private String replication_id;
	
	@Column(name = "createddate")
	private Date createdDate;
	
	@Column(name = "tax_amount__c")
	private Double tax_amount;
	
	@Column(name = "insertthroughtrigger__c")
	private boolean insertthroughtrigger;
	
	@Column(name = "channel_partner__c")
	private String channel_partner;
	
	@Column(name = "reference__c")
	private String reference;
	
	@Column(name = "destination_bank_ifsc_micr__c")
	private String destination_Bank_IFSC_MICR;
	
	@Column(name = "reconciliation_Date__c")
	private Date reconciliation_Date;
	
	@Column(name = "interest__c")
	private Double interest;
	
	@Column(name = "payment_Clearance_Date__c")
	private Date payment_Clearance_Date;
	
	@Column(name = "bounce_charges__c")
	private Double bounce_charges;
	
	@Column(name = "payment_date__c")
	private Date payment_Date;
	
	@Column(name = "ach_Transaction_Code__c")
	private String ach_Transaction_Code;
	
	@Column(name = "code_version__c")
	private String code_version;
	
	@Column(name = "seq_num__c")
	private String seq_num;
	
	@Column(name = "penal_Interest__c")
	private Long penal_Interest;
	
	@Column(name = "pg_transaction_id__c")
	private String pg_transaction_id;
	
	@Column(name = "reason__c")
	private String reason;
	
	@Column(name = "sfid")
	private String sfid;
	
	public TempPaymentUpload() {
		super();
	}

	public TempPaymentUpload(Long id,Long row_num, String dataset_num, String sponsor_Bank_IFSC_MICR,
			String destination_Account_Type, String transaction_Id, Date reconciliation_Date_F,
			String beneficiary_Bank_Account_No, String return_code, String mode_of_Payment, String name,
			String account_Holder_s_Name, String opportunity_Name, boolean isadjustment, Double tdr_amount,
			String ticketNo, String umrn, boolean isdeleted, String opportunity, String type_of_loan,
			Timestamp systemmodstamp, Double amount_Rececived, String remarks, boolean is_failed,
			String payment_Reference, String status, String is_failed_reason, Double actual_emi, Date payment_Date_F,
			String principal, String replication_id, Date createdDate, Double tax_amount, boolean insertthroughtrigger,
			String channel_partner, String reference, String destination_Bank_IFSC_MICR, Date reconciliation_Date,
			Double interest, Date payment_Clearance_Date, Double bounce_charges, Date payment_Date,
			String ach_Transaction_Code, String code_version, String seq_num, Long penal_Interest,
			String pg_transaction_id, String reason, String sfid) {
		super();
		this.id=id;
		this.row_num = row_num;
		this.dataset_num = dataset_num;
		this.sponsor_Bank_IFSC_MICR = sponsor_Bank_IFSC_MICR;
		this.destination_Account_Type = destination_Account_Type;
		this.transaction_Id = transaction_Id;
		this.reconciliation_Date_F = reconciliation_Date_F;
		this.beneficiary_Bank_Account_No = beneficiary_Bank_Account_No;
		this.return_code = return_code;
		this.mode_of_Payment = mode_of_Payment;
		this.name = name;
		this.account_Holder_s_Name = account_Holder_s_Name;
		this.opportunity_Name = opportunity_Name;
		this.isadjustment = isadjustment;
		this.tdr_amount = tdr_amount;
		this.ticketNo = ticketNo;
		this.umrn = umrn;
		this.isdeleted = isdeleted;
		this.opportunity = opportunity;
		this.type_of_loan = type_of_loan;
		this.systemmodstamp = systemmodstamp;
		this.amount_Rececived = amount_Rececived;
		this.remarks = remarks;
		this.is_failed = is_failed;
		this.payment_Reference = payment_Reference;
		this.status = status;
		this.is_failed_reason = is_failed_reason;
		this.actual_emi = actual_emi;
		this.payment_Date_F = payment_Date_F;
		this.principal = principal;
		this.replication_id = replication_id;
		this.createdDate = createdDate;
		this.tax_amount = tax_amount;
		this.insertthroughtrigger = insertthroughtrigger;
		this.channel_partner = channel_partner;
		this.reference = reference;
		this.destination_Bank_IFSC_MICR = destination_Bank_IFSC_MICR;
		this.reconciliation_Date = reconciliation_Date;
		this.interest = interest;
		this.payment_Clearance_Date = payment_Clearance_Date;
		this.bounce_charges = bounce_charges;
		this.payment_Date = payment_Date;
		this.ach_Transaction_Code = ach_Transaction_Code;
		this.code_version = code_version;
		this.seq_num = seq_num;
		this.penal_Interest = penal_Interest;
		this.pg_transaction_id = pg_transaction_id;
		this.reason = reason;
		this.sfid = sfid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRow_num() {
		return row_num;
	}

	public void setRow_num(Long row_num) {
		this.row_num = row_num;
	}

	public String getDataset_num() {
		return dataset_num;
	}

	public void setDataset_num(String dataset_num) {
		this.dataset_num = dataset_num;
	}

	public String getSponsor_Bank_IFSC_MICR() {
		return sponsor_Bank_IFSC_MICR;
	}

	public void setSponsor_Bank_IFSC_MICR(String sponsor_Bank_IFSC_MICR) {
		this.sponsor_Bank_IFSC_MICR = sponsor_Bank_IFSC_MICR;
	}

	public String getDestination_Account_Type() {
		return destination_Account_Type;
	}

	public void setDestination_Account_Type(String destination_Account_Type) {
		this.destination_Account_Type = destination_Account_Type;
	}

	public String getTransaction_Id() {
		return transaction_Id;
	}

	public void setTransaction_Id(String transaction_Id) {
		this.transaction_Id = transaction_Id;
	}

	public Date getReconciliation_Date_F() {
		return reconciliation_Date_F;
	}

	public void setReconciliation_Date_F(Date reconciliation_Date_F) {
		this.reconciliation_Date_F = reconciliation_Date_F;
	}

	public String getBeneficiary_Bank_Account_No() {
		return beneficiary_Bank_Account_No;
	}

	public void setBeneficiary_Bank_Account_No(String beneficiary_Bank_Account_No) {
		this.beneficiary_Bank_Account_No = beneficiary_Bank_Account_No;
	}

	public String getReturn_code() {
		return return_code;
	}

	public void setReturn_code(String return_code) {
		this.return_code = return_code;
	}

	public String getMode_of_Payment() {
		return mode_of_Payment;
	}

	public void setMode_of_Payment(String mode_of_Payment) {
		this.mode_of_Payment = mode_of_Payment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount_Holder_s_Name() {
		return account_Holder_s_Name;
	}

	public void setAccount_Holder_s_Name(String account_Holder_s_Name) {
		this.account_Holder_s_Name = account_Holder_s_Name;
	}

	public String getOpportunity_Name() {
		return opportunity_Name;
	}

	public void setOpportunity_Name(String opportunity_Name) {
		this.opportunity_Name = opportunity_Name;
	}

	public boolean isIsadjustment() {
		return isadjustment;
	}

	public void setIsadjustment(boolean isadjustment) {
		this.isadjustment = isadjustment;
	}

	public Double getTdr_amount() {
		return tdr_amount;
	}

	public void setTdr_amount(Double tdr_amount) {
		this.tdr_amount = tdr_amount;
	}

	public String getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getUmrn() {
		return umrn;
	}

	public void setUmrn(String umrn) {
		this.umrn = umrn;
	}

	public boolean isIsdeleted() {
		return isdeleted;
	}

	public void setIsdeleted(boolean isdeleted) {
		this.isdeleted = isdeleted;
	}

	public String getOpportunity() {
		return opportunity;
	}

	public void setOpportunity(String opportunity) {
		this.opportunity = opportunity;
	}

	public String getType_of_loan() {
		return type_of_loan;
	}

	public void setType_of_loan(String type_of_loan) {
		this.type_of_loan = type_of_loan;
	}

	public Timestamp getSystemmodstamp() {
		return systemmodstamp;
	}

	public void setSystemmodstamp(Timestamp systemmodstamp) {
		this.systemmodstamp = systemmodstamp;
	}

	public Double getAmount_Rececived() {
		return amount_Rececived;
	}

	public void setAmount_Rececived(Double amount_Rececived) {
		this.amount_Rececived = amount_Rececived;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public boolean isIs_failed() {
		return is_failed;
	}

	public void setIs_failed(boolean is_failed) {
		this.is_failed = is_failed;
	}

	public String getPayment_Reference() {
		return payment_Reference;
	}

	public void setPayment_Reference(String payment_Reference) {
		this.payment_Reference = payment_Reference;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIs_failed_reason() {
		return is_failed_reason;
	}

	public void setIs_failed_reason(String is_failed_reason) {
		this.is_failed_reason = is_failed_reason;
	}

	public Double getActual_emi() {
		return actual_emi;
	}

	public void setActual_emi(Double actual_emi) {
		this.actual_emi = actual_emi;
	}

	public Date getPayment_Date_F() {
		return payment_Date_F;
	}

	public void setPayment_Date_F(Date payment_Date_F) {
		this.payment_Date_F = payment_Date_F;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getReplication_id() {
		return replication_id;
	}

	public void setReplication_id(String replication_id) {
		this.replication_id = replication_id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Double getTax_amount() {
		return tax_amount;
	}

	public void setTax_amount(Double tax_amount) {
		this.tax_amount = tax_amount;
	}

	public boolean isInsertthroughtrigger() {
		return insertthroughtrigger;
	}

	public void setInsertthroughtrigger(boolean insertthroughtrigger) {
		this.insertthroughtrigger = insertthroughtrigger;
	}

	public String getChannel_partner() {
		return channel_partner;
	}

	public void setChannel_partner(String channel_partner) {
		this.channel_partner = channel_partner;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDestination_Bank_IFSC_MICR() {
		return destination_Bank_IFSC_MICR;
	}

	public void setDestination_Bank_IFSC_MICR(String destination_Bank_IFSC_MICR) {
		this.destination_Bank_IFSC_MICR = destination_Bank_IFSC_MICR;
	}

	public Date getReconciliation_Date() {
		return reconciliation_Date;
	}

	public void setReconciliation_Date(Date reconciliation_Date) {
		this.reconciliation_Date = reconciliation_Date;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	public Date getPayment_Clearance_Date() {
		return payment_Clearance_Date;
	}

	public void setPayment_Clearance_Date(Date payment_Clearance_Date) {
		this.payment_Clearance_Date = payment_Clearance_Date;
	}

	public Double getBounce_charges() {
		return bounce_charges;
	}

	public void setBounce_charges(Double bounce_charges) {
		this.bounce_charges = bounce_charges;
	}

	public Date getPayment_Date() {
		return payment_Date;
	}

	public void setPayment_Date(Date payment_Date) {
		this.payment_Date = payment_Date;
	}

	public String getAch_Transaction_Code() {
		return ach_Transaction_Code;
	}

	public void setAch_Transaction_Code(String ach_Transaction_Code) {
		this.ach_Transaction_Code = ach_Transaction_Code;
	}

	public String getCode_version() {
		return code_version;
	}

	public void setCode_version(String code_version) {
		this.code_version = code_version;
	}

	public String getSeq_num() {
		return seq_num;
	}

	public void setSeq_num(String seq_num) {
		this.seq_num = seq_num;
	}

	public Long getPenal_Interest() {
		return penal_Interest;
	}

	public void setPenal_Interest(Long penal_Interest) {
		this.penal_Interest = penal_Interest;
	}

	public String getPg_transaction_id() {
		return pg_transaction_id;
	}

	public void setPg_transaction_id(String pg_transaction_id) {
		this.pg_transaction_id = pg_transaction_id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSfid() {
		return sfid;
	}

	public void setSfid(String sfid) {
		this.sfid = sfid;
	}

	@Override
	public String toString() {
		return "TempPaymentUpload [id=" + id + ", row_num=" + row_num + ", dataset_num=" + dataset_num
				+ ", sponsor_Bank_IFSC_MICR=" + sponsor_Bank_IFSC_MICR + ", destination_Account_Type="
				+ destination_Account_Type + ", transaction_Id=" + transaction_Id + ", reconciliation_Date_F="
				+ reconciliation_Date_F + ", beneficiary_Bank_Account_No=" + beneficiary_Bank_Account_No
				+ ", return_code=" + return_code + ", mode_of_Payment=" + mode_of_Payment + ", name=" + name
				+ ", account_Holder_s_Name=" + account_Holder_s_Name + ", opportunity_Name=" + opportunity_Name
				+ ", isadjustment=" + isadjustment + ", tdr_amount=" + tdr_amount + ", ticketNo=" + ticketNo + ", umrn="
				+ umrn + ", isdeleted=" + isdeleted + ", opportunity=" + opportunity + ", type_of_loan=" + type_of_loan
				+ ", systemmodstamp=" + systemmodstamp + ", amount_Rececived=" + amount_Rececived + ", remarks="
				+ remarks + ", is_failed=" + is_failed + ", payment_Reference=" + payment_Reference + ", status="
				+ status + ", is_failed_reason=" + is_failed_reason + ", actual_emi=" + actual_emi + ", payment_Date_F="
				+ payment_Date_F + ", principal=" + principal + ", replication_id=" + replication_id + ", createdDate="
				+ createdDate + ", tax_amount=" + tax_amount + ", insertthroughtrigger=" + insertthroughtrigger
				+ ", channel_partner=" + channel_partner + ", reference=" + reference + ", destination_Bank_IFSC_MICR="
				+ destination_Bank_IFSC_MICR + ", reconciliation_Date=" + reconciliation_Date + ", interest=" + interest
				+ ", payment_Clearance_Date=" + payment_Clearance_Date + ", bounce_charges=" + bounce_charges
				+ ", payment_Date=" + payment_Date + ", ach_Transaction_Code=" + ach_Transaction_Code
				+ ", code_version=" + code_version + ", seq_num=" + seq_num + ", penal_Interest=" + penal_Interest
				+ ", pg_transaction_id=" + pg_transaction_id + ", reason=" + reason + ", sfid=" + sfid + "]";
	}
	
}
