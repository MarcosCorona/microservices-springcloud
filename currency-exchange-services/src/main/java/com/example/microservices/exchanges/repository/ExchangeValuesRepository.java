package com.example.microservices.exchanges.repository;

import com.example.microservices.exchanges.domain.ExchangeValues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeValuesRepository extends JpaRepository<ExchangeValues,Long> {
    ExchangeValues findByFromAndTo(String from, String to);
}
