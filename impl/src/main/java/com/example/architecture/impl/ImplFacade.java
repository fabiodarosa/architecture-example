package com.example.architecture.impl;

import com.example.architecture.impl.order.OrderMediator;
import com.example.architecture.impl.user.UserMediator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ImplFacade {
    private final UserMediator userMediator;
    private final OrderMediator orderMediator;

    public UserMediator user() {
        return userMediator;
    }

    public OrderMediator order() {
        return orderMediator;
    }
}
