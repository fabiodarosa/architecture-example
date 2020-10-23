package com.example.architecture.impl.order;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class OrderMediator {

    public String find() {
        return "Order";
    }

}
