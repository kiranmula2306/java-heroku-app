package com.dmi.payments.schedule;

import java.util.Date;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.dmi.payments.schedule.service.TempPaymentUploadService;


@SpringBootApplication
public class DmiPaymentsScheduleApplication implements CommandLineRunner {

	@Autowired
	TempPaymentUploadService tempService;
	
	private static final Logger LOGGER=LoggerFactory.getLogger(DmiPaymentsScheduleApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DmiPaymentsScheduleApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Ticket No:");
		String name = null;
		if (scanner.hasNext()) {
			name = scanner.nextLine();
		}
		LOGGER.info("Total Start Time:"+new Date());
		String finalStatus=tempService.createPaymentHistory(name);
		LOGGER.info("PH Creation Status and TPU Update Status " + finalStatus);
		LOGGER.info("Total End Time:"+new Date());
	}
}
