package com.dmi.payments.schedule.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lead_source__c")
public class LeadSource {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "sfid", nullable = false)
	private String sfid;
	
	@Column(name="systemmodstamp", nullable = false)
	private Date  systemModStamp;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "isdeleted", nullable = false)
	private boolean isDeleted;
	
	@Column(name="createddate", nullable = false)
	private Date  createdDate;

	public LeadSource() {
		
	}
	
	public LeadSource(long id, String sfid, Date systemModStamp, String name, boolean isDeleted, Date createdDate) {
		super();
		this.id = id;
		this.sfid = sfid;
		this.systemModStamp = systemModStamp;
		this.name = name;
		this.isDeleted = isDeleted;
		this.createdDate = createdDate;
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

	public Date getSystemModStamp() {
		return systemModStamp;
	}

	public void setSystemModStamp(Date systemModStamp) {
		this.systemModStamp = systemModStamp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "LeadSource [id=" + id + ", sfid=" + sfid + ", systemModStamp=" + systemModStamp + ", name=" + name
				+ ", isDeleted=" + isDeleted + ", createdDate=" + createdDate + "]";
	}

}