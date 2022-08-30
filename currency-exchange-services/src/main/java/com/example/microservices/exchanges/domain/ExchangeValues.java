package com.example.microservices.exchanges.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class ExchangeValues {
    @Id
    @GeneratedValue()
    private Long id;
    @Column(name = "currency_from")
    private String from;
    @Column(name = "currency_to")
    private String to;
    @Column
    private BigDecimal conversionMultiple;

    @Column
    private int port;


}
