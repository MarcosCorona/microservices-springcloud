package com.example.microservices.exchanges.controller;

import com.example.microservices.exchanges.domain.ExchangeValues;
import com.example.microservices.exchanges.repository.ExchangeValuesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class CurrencyExchangeController {
    @Autowired
    private Environment environment;

    @Autowired
    ExchangeValuesRepository exchangeValueRepository;



    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValues retrieveExchangeValues(@PathVariable String from, @PathVariable String to){
        ExchangeValues exchangeValues = exchangeValueRepository.findByFromAndTo(from,to);
        exchangeValues.setPort(Integer.parseInt(Objects.requireNonNull(environment.getProperty("local.server.port"))));
        return exchangeValues;
    }
}
