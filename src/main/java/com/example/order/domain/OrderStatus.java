package com.example.order.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@Data
@AllArgsConstructor
public class OrderStatus {

    private String status;

    private Instant date;
}
