package com.example.architecture.impl.delivery;

import org.springframework.stereotype.Component;

@Component
public class DeliveryService {
    public String findByOrder(String orderCode) {
        return "Delivery";
    }
}
