package com.grandpaweather.aggregator.repository;

import com.grandpaweather.aggregator.domain.Mediator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediatorRepository extends JpaRepository<Mediator, Long> {
}
