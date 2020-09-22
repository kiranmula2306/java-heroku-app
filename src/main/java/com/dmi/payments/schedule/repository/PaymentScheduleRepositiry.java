package com.dmi.payments.schedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmi.payments.schedule.model.PaymentSchedules;

public interface PaymentScheduleRepositiry extends JpaRepository<PaymentSchedules, Long> {

}
