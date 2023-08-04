package org.example.dto;

import lombok.Data;

@Data
public class OrderDto {
    private String customerId;
    private PersonDto customerData;
}
