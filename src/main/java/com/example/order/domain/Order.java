package com.example.order.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {

    private String product;

    private Integer quantity;

}
