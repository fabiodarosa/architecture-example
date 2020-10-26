package com.example.architecture.impl.delivery;

import com.example.architecture.impl.order.OrderService;
import com.example.architecture.impl.user.model.UserModel;
import com.example.architecture.impl.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class DeliveryMediator {

    private final DeliveryService deliveryService;
    private final OrderService orderService;
    private final UserService userService;


    public String findByClientCPF(String cpf) {
        UserModel user = userService.findById(cpf);
        String order = orderService.order(user.getName());
        return deliveryService.findByOrder(order);
    }
}
