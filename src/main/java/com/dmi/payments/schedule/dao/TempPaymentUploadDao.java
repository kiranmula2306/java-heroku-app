package com.dmi.payments.schedule.dao;

import java.util.List;

import com.dmi.payments.schedule.model.TempPaymentsFacade;

public interface TempPaymentUploadDao {

	TempPaymentsFacade findAllTPUsByTicketNo(String ticketNo);

	boolean updateTPUStatus(String tpuId);

	TempPaymentsFacade findAllTPUsByParentOpportunity(List<String> opportunityName);

}
