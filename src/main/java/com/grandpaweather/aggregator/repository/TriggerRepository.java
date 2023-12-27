package com.grandpaweather.aggregator.repository;

import com.grandpaweather.aggregator.domain.Trigger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TriggerRepository extends JpaRepository<Trigger, Long> {
}
