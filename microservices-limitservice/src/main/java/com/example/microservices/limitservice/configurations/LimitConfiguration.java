package com.example.microservices.limitservice.configurations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class  LimitConfiguration {
    private int maximum;
    private int minimum;
}
