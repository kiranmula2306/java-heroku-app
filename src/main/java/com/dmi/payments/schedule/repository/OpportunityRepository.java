package com.dmi.payments.schedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmi.payments.schedule.model.Opportunity;

public interface OpportunityRepository extends JpaRepository<Opportunity, Long>{

}
