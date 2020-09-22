package com.dmi.payments.schedule.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Opportunity")
public class Opportunity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "StageName")
	private String stageName;
	
	@Column(name = "Parent_Opportunity__c")
	private String parent_Opportunity;
	
	@Column(name = "Type_of_Loan__c")
	private String type_of_Loan;
	
	@Column(name = "Current_Face__c")
	private Double current_Face;
	
	@Column(name = "accountid")
	private Long accountid;
	
	@Column(name = "recordTypeId")
	private String recordTypeId;
	
	@Column(name = "recordtype")
	private String recordtype;
	
	@Column(name = "Accrued_Interest_Partner__c ")
	private String accrued_Interest_Partner;
	
	@Column(name = "account_record_type__c")
	private String account_record_type;
	
	@Column(name = "ph_total_payment__c")
	private String ph_total_payment;
	
	@Column(name = "ps_total_payment__c")
	private String ps_total_payment;
	
	public Opportunity(String name, String stageName, String parent_Opportunity, String type_of_Loan,
			Double current_Face, Long accountid, String recordTypeId, String recordtype,
			String accrued_Interest_Partner, String account_record_type, String ph_total_payment,
			String ps_total_payment) {
		super();
		this.name = name;
		this.stageName = stageName;
		this.parent_Opportunity = parent_Opportunity;
		this.type_of_Loan = type_of_Loan;
		this.current_Face = current_Face;
		this.accountid = accountid;
		this.recordTypeId = recordTypeId;
		this.recordtype = recordtype;
		this.accrued_Interest_Partner = accrued_Interest_Partner;
		this.account_record_type = account_record_type;
		this.ph_total_payment = ph_total_payment;
		this.ps_total_payment = ps_total_payment;
	}

	public Opportunity() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStageName() {
		return stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public String getParent_Opportunity() {
		return parent_Opportunity;
	}

	public void setParent_Opportunity(String parent_Opportunity) {
		this.parent_Opportunity = parent_Opportunity;
	}

	public String getType_of_Loan() {
		return type_of_Loan;
	}

	public void setType_of_Loan(String type_of_Loan) {
		this.type_of_Loan = type_of_Loan;
	}

	public Double getCurrent_Face() {
		return current_Face;
	}

	public void setCurrent_Face(Double current_Face) {
		this.current_Face = current_Face;
	}

	public Long getAccountid() {
		return accountid;
	}

	public void setAccountid(Long accountid) {
		this.accountid = accountid;
	}

	public String getRecordTypeId() {
		return recordTypeId;
	}

	public void setRecordTypeId(String recordTypeId) {
		this.recordTypeId = recordTypeId;
	}

	public String getRecordtype() {
		return recordtype;
	}

	public void setRecordtype(String recordtype) {
		this.recordtype = recordtype;
	}

	public String getAccrued_Interest_Partner() {
		return accrued_Interest_Partner;
	}

	public void setAccrued_Interest_Partner(String accrued_Interest_Partner) {
		this.accrued_Interest_Partner = accrued_Interest_Partner;
	}

	public String getAccount_record_type() {
		return account_record_type;
	}

	public void setAccount_record_type(String account_record_type) {
		this.account_record_type = account_record_type;
	}

	public String getPh_total_payment() {
		return ph_total_payment;
	}

	public void setPh_total_payment(String ph_total_payment) {
		this.ph_total_payment = ph_total_payment;
	}

	public String getPs_total_payment() {
		return ps_total_payment;
	}

	public void setPs_total_payment(String ps_total_payment) {
		this.ps_total_payment = ps_total_payment;
	}

	@Override
	public String toString() {
		return "Opportunity [id=" + id + ", name=" + name + ", stageName=" + stageName + ", parent_Opportunity="
				+ parent_Opportunity + ", type_of_Loan=" + type_of_Loan + ", current_Face=" + current_Face
				+ ", accountid=" + accountid + ", recordTypeId=" + recordTypeId + ", recordtype=" + recordtype
				+ ", accrued_Interest_Partner=" + accrued_Interest_Partner + ", account_record_type="
				+ account_record_type + ", ph_total_payment=" + ph_total_payment + ", ps_total_payment="
				+ ps_total_payment + "]";
	}

}
