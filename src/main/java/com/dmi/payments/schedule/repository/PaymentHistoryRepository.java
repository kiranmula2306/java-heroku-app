package com.dmi.payments.schedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmi.payments.schedule.model.PaymentHistory;

public interface PaymentHistoryRepository extends JpaRepository<PaymentHistory, Long> {

}
