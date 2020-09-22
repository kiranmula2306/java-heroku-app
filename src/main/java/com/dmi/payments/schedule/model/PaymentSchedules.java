package com.dmi.payments.schedule.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment_schedules__c")
public class PaymentSchedules {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "sfid")
	private String sfid;
	
	@Column(name = "net_payment__c")
	private double net_Payment;
	
	@Column(name = "penal_interest__c")
	private double penal_Interest;
	
	@Column(name = "closingprincipalbal_as_per_books__c")
	private double closingPrincipalBal_As_Per_Books;
	
	@Column(name = "partner_share__c")
	private double partner_Share;
	
	@Column(name = "bounce_charges__c")
	private double bounce_Charges;
	
	@Column(name = "createdbyid")
	private String createdById;
	
	@Column(name = "principalpmt__c")
	private double principalPmt;
	
	@Column(name = "reconciliation_date__c")
	private Date reconciliation_Date;
	
	@Column(name = "access_payment__c")
	private double access_Payment;
	
	@Column(name = "interestpmt__c")
	private double interestPmt;
	
	@Column(name = " createddate")
	private Date  createdDate;
	
	@Column(name = "date__c")
	private Date date;
	
	@Column(name = "tpu_name__c")
	private String tpu_Name;
	
	@Column(name = "dmi_upside__c")
	private double dmi_Upside;
	
	@Column(name = "payment_reference__c")
	private String payment_Reference;
	
	@Column(name = "payment_received_date__c")
	private Date payment_Received_Date;
	
	@Column(name = "systemmodstamp")
	private Date systemModStamp;
	
	@Column(name = "opportunity__c")
	private String opportunity;
	
	@Column(name = "isdeleted")
	private boolean isDeleted;

	@Column(name = "closingprincipalbal__c")
	private double closingPrincipalBal;

	@Column(name = "close_date__c")
	private Date close_Date;

	@Column(name = "isreportedtoaccount__c")
	private boolean isReportedToAccount;

	@Column(name = "leadsource__c")
	private String leadSource;

	@Column(name = "bankremarks__c")
	private String bankRemarks;

	@Column(name = "name")
	private String name;
	
	@Column(name = "open_principal__c")
	private double open_Principal;
	
	@Column(name = "isreportedtomule__c")
	private double isReportedToMule;
	
	@Column(name = " mode_of_payment__c")
	private String  mode_Of_Payment;
	
	@Column(name = "clearance__c")
	private boolean clearance;
	
	@Column(name = "isupdatedfrom_ph__c")
	private boolean isUpdatedFrom_Ph;
	
	@Column(name = " cp_external_id__c")
	private String  cp_External_Id;
	
	@Column(name = "delinquent_days__c")
	private double delinquent_Days;
	
	@Column(name = "tds__c")
	private double tds;
	
	@Column(name = "closingprincipalbalance__c")
	private double closingPrincipalBalance;
	
	public PaymentSchedules() {
		
	}

	public PaymentSchedules(long id, String sfid, double net_Payment, double penal_Interest,
			double closingPrincipalBal_As_Per_Books, double partner_Share, double bounce_Charges, String createdById,
			double principalPmt, Date reconciliation_Date, double access_Payment, double interestPmt, Date createdDate,
			Date date, String tpu_Name, double dmi_Upside, String payment_Reference, Date payment_Received_Date,
			Date systemModStamp, String opportunity, boolean isDeleted, double closingPrincipalBal, Date close_Date,
			boolean isReportedToAccount, String leadSource, String bankRemarks, String name, double open_Principal,
			double isReportedToMule, String mode_Of_Payment, boolean clearance, boolean isUpdatedFrom_Ph,
			String cp_External_Id, double delinquent_Days, double tds, double closingPrincipalBalance) {
		super();
		this.id = id;
		this.sfid = sfid;
		this.net_Payment = net_Payment;
		this.penal_Interest = penal_Interest;
		this.closingPrincipalBal_As_Per_Books = closingPrincipalBal_As_Per_Books;
		this.partner_Share = partner_Share;
		this.bounce_Charges = bounce_Charges;
		this.createdById = createdById;
		this.principalPmt = principalPmt;
		this.reconciliation_Date = reconciliation_Date;
		this.access_Payment = access_Payment;
		this.interestPmt = interestPmt;
		this.createdDate = createdDate;
		this.date = date;
		this.tpu_Name = tpu_Name;
		this.dmi_Upside = dmi_Upside;
		this.payment_Reference = payment_Reference;
		this.payment_Received_Date = payment_Received_Date;
		this.systemModStamp = systemModStamp;
		this.opportunity = opportunity;
		this.isDeleted = isDeleted;
		this.closingPrincipalBal = closingPrincipalBal;
		this.close_Date = close_Date;
		this.isReportedToAccount = isReportedToAccount;
		this.leadSource = leadSource;
		this.bankRemarks = bankRemarks;
		this.name = name;
		this.open_Principal = open_Principal;
		this.isReportedToMule = isReportedToMule;
		this.mode_Of_Payment = mode_Of_Payment;
		this.clearance = clearance;
		this.isUpdatedFrom_Ph = isUpdatedFrom_Ph;
		this.cp_External_Id = cp_External_Id;
		this.delinquent_Days = delinquent_Days;
		this.tds = tds;
		this.closingPrincipalBalance = closingPrincipalBalance;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSfid() {
		return sfid;
	}

	public void setSfid(String sfid) {
		this.sfid = sfid;
	}

	public double getNet_Payment() {
		return net_Payment;
	}

	public void setNet_Payment(double net_Payment) {
		this.net_Payment = net_Payment;
	}

	public double getPenal_Interest() {
		return penal_Interest;
	}

	public void setPenal_Interest(double penal_Interest) {
		this.penal_Interest = penal_Interest;
	}

	public double getClosingPrincipalBal_As_Per_Books() {
		return closingPrincipalBal_As_Per_Books;
	}

	public void setClosingPrincipalBal_As_Per_Books(double closingPrincipalBal_As_Per_Books) {
		this.closingPrincipalBal_As_Per_Books = closingPrincipalBal_As_Per_Books;
	}

	public double getPartner_Share() {
		return partner_Share;
	}

	public void setPartner_Share(double partner_Share) {
		this.partner_Share = partner_Share;
	}

	public double getBounce_Charges() {
		return bounce_Charges;
	}

	public void setBounce_Charges(double bounce_Charges) {
		this.bounce_Charges = bounce_Charges;
	}

	public String getCreatedById() {
		return createdById;
	}

	public void setCreatedById(String createdById) {
		this.createdById = createdById;
	}

	public double getPrincipalPmt() {
		return principalPmt;
	}

	public void setPrincipalPmt(double principalPmt) {
		this.principalPmt = principalPmt;
	}

	public Date getReconciliation_Date() {
		return reconciliation_Date;
	}

	public void setReconciliation_Date(Date reconciliation_Date) {
		this.reconciliation_Date = reconciliation_Date;
	}

	public double getAccess_Payment() {
		return access_Payment;
	}

	public void setAccess_Payment(double access_Payment) {
		this.access_Payment = access_Payment;
	}

	public double getInterestPmt() {
		return interestPmt;
	}

	public void setInterestPmt(double interestPmt) {
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

	public String getTpu_Name() {
		return tpu_Name;
	}

	public void setTpu_Name(String tpu_Name) {
		this.tpu_Name = tpu_Name;
	}

	public double getDmi_Upside() {
		return dmi_Upside;
	}

	public void setDmi_Upside(double dmi_Upside) {
		this.dmi_Upside = dmi_Upside;
	}

	public String getPayment_Reference() {
		return payment_Reference;
	}

	public void setPayment_Reference(String payment_Reference) {
		this.payment_Reference = payment_Reference;
	}

	public Date getPayment_Received_Date() {
		return payment_Received_Date;
	}

	public void setPayment_Received_Date(Date payment_Received_Date) {
		this.payment_Received_Date = payment_Received_Date;
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

	public double getClosingPrincipalBal() {
		return closingPrincipalBal;
	}

	public void setClosingPrincipalBal(double closingPrincipalBal) {
		this.closingPrincipalBal = closingPrincipalBal;
	}

	public Date getClose_Date() {
		return close_Date;
	}

	public void setClose_Date(Date close_Date) {
		this.close_Date = close_Date;
	}

	public boolean isReportedToAccount() {
		return isReportedToAccount;
	}

	public void setReportedToAccount(boolean isReportedToAccount) {
		this.isReportedToAccount = isReportedToAccount;
	}

	public String getLeadSource() {
		return leadSource;
	}

	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}

	public String getBankRemarks() {
		return bankRemarks;
	}

	public void setBankRemarks(String bankRemarks) {
		this.bankRemarks = bankRemarks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getOpen_Principal() {
		return open_Principal;
	}

	public void setOpen_Principal(double open_Principal) {
		this.open_Principal = open_Principal;
	}

	public double getIsReportedToMule() {
		return isReportedToMule;
	}

	public void setIsReportedToMule(double isReportedToMule) {
		this.isReportedToMule = isReportedToMule;
	}

	public String getMode_Of_Payment() {
		return mode_Of_Payment;
	}

	public void setMode_Of_Payment(String mode_Of_Payment) {
		this.mode_Of_Payment = mode_Of_Payment;
	}

	public boolean isClearance() {
		return clearance;
	}

	public void setClearance(boolean clearance) {
		this.clearance = clearance;
	}

	public boolean isUpdatedFrom_Ph() {
		return isUpdatedFrom_Ph;
	}

	public void setUpdatedFrom_Ph(boolean isUpdatedFrom_Ph) {
		this.isUpdatedFrom_Ph = isUpdatedFrom_Ph;
	}

	public String getCp_External_Id() {
		return cp_External_Id;
	}

	public void setCp_External_Id(String cp_External_Id) {
		this.cp_External_Id = cp_External_Id;
	}

	public double getDelinquent_Days() {
		return delinquent_Days;
	}

	public void setDelinquent_Days(double delinquent_Days) {
		this.delinquent_Days = delinquent_Days;
	}

	public double getTds() {
		return tds;
	}

	public void setTds(double tds) {
		this.tds = tds;
	}

	public double getClosingPrincipalBalance() {
		return closingPrincipalBalance;
	}

	public void setClosingPrincipalBalance(double closingPrincipalBalance) {
		this.closingPrincipalBalance = closingPrincipalBalance;
	}

	@Override
	public String toString() {
		return "PaymentSchedules [id=" + id + ", sfid=" + sfid + ", net_Payment=" + net_Payment + ", penal_Interest="
				+ penal_Interest + ", closingPrincipalBal_As_Per_Books=" + closingPrincipalBal_As_Per_Books
				+ ", partner_Share=" + partner_Share + ", bounce_Charges=" + bounce_Charges + ", createdById="
				+ createdById + ", principalPmt=" + principalPmt + ", reconciliation_Date=" + reconciliation_Date
				+ ", access_Payment=" + access_Payment + ", interestPmt=" + interestPmt + ", createdDate=" + createdDate
				+ ", date=" + date + ", tpu_Name=" + tpu_Name + ", dmi_Upside=" + dmi_Upside + ", payment_Reference="
				+ payment_Reference + ", payment_Received_Date=" + payment_Received_Date + ", systemModStamp="
				+ systemModStamp + ", opportunity=" + opportunity + ", isDeleted=" + isDeleted
				+ ", closingPrincipalBal=" + closingPrincipalBal + ", close_Date=" + close_Date
				+ ", isReportedToAccount=" + isReportedToAccount + ", leadSource=" + leadSource + ", bankRemarks="
				+ bankRemarks + ", name=" + name + ", open_Principal=" + open_Principal + ", isReportedToMule="
				+ isReportedToMule + ", mode_Of_Payment=" + mode_Of_Payment + ", clearance=" + clearance
				+ ", isUpdatedFrom_Ph=" + isUpdatedFrom_Ph + ", cp_External_Id=" + cp_External_Id + ", delinquent_Days="
				+ delinquent_Days + ", tds=" + tds + ", closingPrincipalBalance=" + closingPrincipalBalance + "]";
	}
	
}
