package com.dmi.payments.schedule.model;

import java.util.List;

public class TempPaymentsFacade {

	List<CurrentFaces> currentFaces;
	private List<TempPaymentUpload> tempPaymentList;
	
	public TempPaymentsFacade() {
		
	}

	public List<CurrentFaces> getCurrentFaces() {
		return currentFaces;
	}

	public void setCurrentFaces(List<CurrentFaces> currentFaces) {
		this.currentFaces = currentFaces;
	}

	public List<TempPaymentUpload> getTempPaymentList() {
		return tempPaymentList;
	}

	public void setTempPaymentList(List<TempPaymentUpload> tempPaymentList) {
		this.tempPaymentList = tempPaymentList;
	}

	@Override
	public String toString() {
		return "TempPaymentsFacade [curretFaces=" + currentFaces + ", tempPaymentList=" + tempPaymentList + "]";
	}
	
}
