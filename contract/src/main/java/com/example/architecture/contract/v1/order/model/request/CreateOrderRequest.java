package com.example.architecture.contract.v1.order.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateOrderRequest {
    private String name;
    private Integer age;
}
