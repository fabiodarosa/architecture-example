package com.example.architecture.impl.order;

import com.example.architecture.impl.user.model.UserModel;
import com.example.architecture.impl.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class OrderMediator {

    private UserService userService;
    private OrderService orderService;

    public String find(String clientCPF) {
        UserModel user = userService.findById(clientCPF);
        return orderService.order(user.getName());
    }

}
