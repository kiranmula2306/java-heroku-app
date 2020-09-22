package com.dmi.payments.schedule.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lead")
public class Lead {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "sfid")
	private String sfid;
	
	@Column(name = "is_already_credit_line__c")
	private boolean is_Already_Credit_Line;
	
	@Column(name = "risk_bucket__c")
	private String risk_Bucket;

	@Column(name = "lead_contact__c")
	private String lead_Contact;
	
	@Column(name = "recordtype_list__c")
	private String recordType_List;
	
	@Column(name = "pulled_leadsource__c")
	private String pulled_LeadSource;
	
	@Column(name = "loancategory__c")
	private String loanCategory;
	
	@Column(name = "dedupe_status__c")
	private String dedupe_Status;
	
	@Column(name = "convertedopportunityid")
	private String convertedOpportunity;
	
	@Column(name = "ready_for_conversion__c")
	private String ready_For_Conversion;
	
	@Column(name = "convert_lead__c")
	private boolean convert_Lead;
	
	@Column(name = "leadsource_s__c")
	private String leadSource_s;
	
	@Column(name = "createddate")
	private Date  createdDate;
	
	@Column(name = "ready_for_decision__c")
	private String ready_For_Decision;
	
	@Column(name = "systemmodstamp")
	private Date  systemModStamp;
	
	@Column(name = "isdeleted")
	private boolean isDeleted;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "credit_decision__c")
	private String credit_Decision;
	
	@Column(name = "converteddate")
	private Date  convertedDate;

	public Lead( ) {
		
	}
	
	public Lead(long id, String sfid, boolean is_Already_Credit_Line, String risk_Bucket, String lead_Contact,
			String recordType_List, String pulled_LeadSource, String loanCategory, String dedupe_Status,
			String convertedOpportunity, String ready_For_Conversion, boolean convert_Lead, String leadSource_s,
			Date createdDate, String ready_For_Decision, Date systemModStamp, boolean isDeleted, String name,
			String credit_Decision, Date convertedDate) {
		super();
		this.id = id;
		this.sfid = sfid;
		this.is_Already_Credit_Line = is_Already_Credit_Line;
		this.risk_Bucket = risk_Bucket;
		this.lead_Contact = lead_Contact;
		this.recordType_List = recordType_List;
		this.pulled_LeadSource = pulled_LeadSource;
		this.loanCategory = loanCategory;
		this.dedupe_Status = dedupe_Status;
		this.convertedOpportunity = convertedOpportunity;
		this.ready_For_Conversion = ready_For_Conversion;
		this.convert_Lead = convert_Lead;
		this.leadSource_s = leadSource_s;
		this.createdDate = createdDate;
		this.ready_For_Decision = ready_For_Decision;
		this.systemModStamp = systemModStamp;
		this.isDeleted = isDeleted;
		this.name = name;
		this.credit_Decision = credit_Decision;
		this.convertedDate = convertedDate;
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

	public boolean isIs_Already_Credit_Line() {
		return is_Already_Credit_Line;
	}

	public void setIs_Already_Credit_Line(boolean is_Already_Credit_Line) {
		this.is_Already_Credit_Line = is_Already_Credit_Line;
	}

	public String getRisk_Bucket() {
		return risk_Bucket;
	}

	public void setRisk_Bucket(String risk_Bucket) {
		this.risk_Bucket = risk_Bucket;
	}

	public String getLead_Contact() {
		return lead_Contact;
	}

	public void setLead_Contact(String lead_Contact) {
		this.lead_Contact = lead_Contact;
	}

	public String getRecordType_List() {
		return recordType_List;
	}

	public void setRecordType_List(String recordType_List) {
		this.recordType_List = recordType_List;
	}

	public String getPulled_LeadSource() {
		return pulled_LeadSource;
	}

	public void setPulled_LeadSource(String pulled_LeadSource) {
		this.pulled_LeadSource = pulled_LeadSource;
	}

	public String getLoanCategory() {
		return loanCategory;
	}

	public void setLoanCategory(String loanCategory) {
		this.loanCategory = loanCategory;
	}

	public String getDedupe_Status() {
		return dedupe_Status;
	}

	public void setDedupe_Status(String dedupe_Status) {
		this.dedupe_Status = dedupe_Status;
	}

	public String getConvertedOpportunity() {
		return convertedOpportunity;
	}

	public void setConvertedOpportunity(String convertedOpportunity) {
		this.convertedOpportunity = convertedOpportunity;
	}

	public String getReady_For_Conversion() {
		return ready_For_Conversion;
	}

	public void setReady_For_Conversion(String ready_For_Conversion) {
		this.ready_For_Conversion = ready_For_Conversion;
	}

	public boolean isConvert_Lead() {
		return convert_Lead;
	}

	public void setConvert_Lead(boolean convert_Lead) {
		this.convert_Lead = convert_Lead;
	}

	public String getLeadSource_s() {
		return leadSource_s;
	}

	public void setLeadSource_s(String leadSource_s) {
		this.leadSource_s = leadSource_s;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getReady_For_Decision() {
		return ready_For_Decision;
	}

	public void setReady_For_Decision(String ready_For_Decision) {
		this.ready_For_Decision = ready_For_Decision;
	}

	public Date getSystemModStamp() {
		return systemModStamp;
	}

	public void setSystemModStamp(Date systemModStamp) {
		this.systemModStamp = systemModStamp;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCredit_Decision() {
		return credit_Decision;
	}

	public void setCredit_Decision(String credit_Decision) {
		this.credit_Decision = credit_Decision;
	}

	public Date getConvertedDate() {
		return convertedDate;
	}

	public void setConvertedDate(Date convertedDate) {
		this.convertedDate = convertedDate;
	}

	@Override
	public String toString() {
		return "Lead [id=" + id + ", sfid=" + sfid + ", is_Already_Credit_Line=" + is_Already_Credit_Line
				+ ", risk_Bucket=" + risk_Bucket + ", lead_Contact=" + lead_Contact + ", recordType_List="
				+ recordType_List + ", pulled_LeadSource=" + pulled_LeadSource + ", loanCategory=" + loanCategory
				+ ", dedupe_Status=" + dedupe_Status + ", convertedOpportunity=" + convertedOpportunity
				+ ", ready_For_Conversion=" + ready_For_Conversion + ", convert_Lead=" + convert_Lead
				+ ", leadSource_s=" + leadSource_s + ", createdDate=" + createdDate + ", ready_For_Decision="
				+ ready_For_Decision + ", systemModStamp=" + systemModStamp + ", isDeleted=" + isDeleted + ", name="
				+ name + ", credit_Decision=" + credit_Decision + ", convertedDate=" + convertedDate + "]";
	}
	
}
