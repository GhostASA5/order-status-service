package com.example.order.domain;

import lombok.Data;

@Data
public class OrderEvent {

    private String product;

    private Integer quantity;
}
