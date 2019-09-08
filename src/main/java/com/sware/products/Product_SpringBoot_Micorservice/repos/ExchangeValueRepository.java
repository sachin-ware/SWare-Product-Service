package com.sware.products.Product_SpringBoot_Micorservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sware.products.Product_SpringBoot_Micorservice.domain.ExchangeValue;

public interface ExchangeValueRepository extends 
    JpaRepository<ExchangeValue, Long>{
  ExchangeValue findByFromAndTo(String from, String to);
}