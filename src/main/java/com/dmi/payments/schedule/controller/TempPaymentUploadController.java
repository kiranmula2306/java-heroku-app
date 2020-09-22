package com.dmi.payments.schedule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dmi.payments.schedule.model.TempPaymentUpload;
import com.dmi.payments.schedule.repository.OpportunityRepository;
import com.dmi.payments.schedule.service.TempPaymentUploadService;

@RestController
@RequestMapping("/dmi/tempPayments")
public class TempPaymentUploadController {

	@Autowired
	TempPaymentUploadService tempPaymentUploadService;

	@Autowired
	OpportunityRepository opportunityRepository;

	/*
	 * @GetMapping("/tktNo/ticketNo") public String
	 * getPaymentByTicketId(@RequestParam(value = "id") String ticketNo) {
	 * 
	 * List<TempPaymentUpload> adjustedTPUList =
	 * tempPaymentUploadService.findByTicketId(ticketNo);
	 * 
	 * return "Succesfully Record Inserted"; }
	 */
}
