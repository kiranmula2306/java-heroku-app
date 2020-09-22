package com.dmi.payments.schedule.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moratorium__c")
public class Moratorium {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "sfid", nullable = false)
	private String sfid;
	
	@Column(name = "number_of_months__c", nullable = false)
	private double number_Of_Months;
	
	@Column(name = "moratorium_processed__c", nullable = false)
	private String moratorium_Processed;
	
	@Column(name="start_date__c", nullable = false)
	private Date  start_Date;
	
	@Column(name = "insertthroughtrigger__c", nullable = false)
	private boolean insertThroughTrigger;
	
	@Column(name = "accruedinterest__c", nullable = false)
	private double accruedInterest;
	
	@Column(name="createddate", nullable = false)
	private Date  createdDate;
	
	@Column(name="end_date__c", nullable = false)
	private Date  end_Date;
	
	@Column(name="systemmodstamp", nullable = false)
	private Date  systemModStamp;
	
	@Column(name = "opportunity__c", nullable = false)
	private String opportunity;
	
	@Column(name = "isdeleted", nullable = false)
	private boolean isDeleted;
	
	@Column(name = "moratoriumtoapply__c", nullable = false)
	private String moratoriumToApply;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "moratorium_type__c", nullable = false)
	private String moratorium_Type;
	
	@Column(name="request_date__c", nullable = false)
	private Date  request_Date;

	public Moratorium( ) {
		
	}
	
	public Moratorium(long id, String sfid, double number_Of_Months, String moratorium_Processed, Date start_Date,
			boolean insertThroughTrigger, double accruedInterest, Date createdDate, Date end_Date, Date systemModStamp,
			String opportunity, boolean isDeleted, String moratoriumToApply, String name, String moratorium_Type,
			Date request_Date) {
		super();
		this.id = id;
		this.sfid = sfid;
		this.number_Of_Months = number_Of_Months;
		this.moratorium_Processed = moratorium_Processed;
		this.start_Date = start_Date;
		this.insertThroughTrigger = insertThroughTrigger;
		this.accruedInterest = accruedInterest;
		this.createdDate = createdDate;
		this.end_Date = end_Date;
		this.systemModStamp = systemModStamp;
		this.opportunity = opportunity;
		this.isDeleted = isDeleted;
		this.moratoriumToApply = moratoriumToApply;
		this.name = name;
		this.moratorium_Type = moratorium_Type;
		this.request_Date = request_Date;
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

	public double getNumber_Of_Months() {
		return number_Of_Months;
	}

	public void setNumber_Of_Months(double number_Of_Months) {
		this.number_Of_Months = number_Of_Months;
	}

	public String getMoratorium_Processed() {
		return moratorium_Processed;
	}

	public void setMoratorium_Processed(String moratorium_Processed) {
		this.moratorium_Processed = moratorium_Processed;
	}

	public Date getStart_Date() {
		return start_Date;
	}

	public void setStart_Date(Date start_Date) {
		this.start_Date = start_Date;
	}

	public boolean isInsertThroughTrigger() {
		return insertThroughTrigger;
	}

	public void setInsertThroughTrigger(boolean insertThroughTrigger) {
		this.insertThroughTrigger = insertThroughTrigger;
	}

	public double getAccruedInterest() {
		return accruedInterest;
	}

	public void setAccruedInterest(double accruedInterest) {
		this.accruedInterest = accruedInterest;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getEnd_Date() {
		return end_Date;
	}

	public void setEnd_Date(Date end_Date) {
		this.end_Date = end_Date;
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

	public String getMoratoriumToApply() {
		return moratoriumToApply;
	}

	public void setMoratoriumToApply(String moratoriumToApply) {
		this.moratoriumToApply = moratoriumToApply;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoratorium_Type() {
		return moratorium_Type;
	}

	public void setMoratorium_Type(String moratorium_Type) {
		this.moratorium_Type = moratorium_Type;
	}

	public Date getRequest_Date() {
		return request_Date;
	}

	public void setRequest_Date(Date request_Date) {
		this.request_Date = request_Date;
	}

	@Override
	public String toString() {
		return "Moratorium [id=" + id + ", sfid=" + sfid + ", number_Of_Months=" + number_Of_Months
				+ ", moratorium_Processed=" + moratorium_Processed + ", start_Date=" + start_Date
				+ ", insertThroughTrigger=" + insertThroughTrigger + ", accruedInterest=" + accruedInterest
				+ ", createdDate=" + createdDate + ", end_Date=" + end_Date + ", systemModStamp=" + systemModStamp
				+ ", opportunity=" + opportunity + ", isDeleted=" + isDeleted + ", moratoriumToApply="
				+ moratoriumToApply + ", name=" + name + ", moratorium_Type=" + moratorium_Type + ", request_Date="
				+ request_Date + "]";
	}

}
