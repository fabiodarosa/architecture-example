package com.example.architecture.contract.v1.order.mapper;

import com.example.architecture.contract.v1.order.model.request.CreateOrderRequest;
import com.example.architecture.contract.v1.order.model.response.OrderResponse;
import com.example.architecture.impl.user.model.UserModel;

public class OrderMapper {

    public static OrderResponse mapToContract(UserModel userModel) {
        return OrderResponse.builder()
                .id(userModel.getId())
                .name(userModel.getName())
                .age(userModel.getAge())
                .build();
    }

    public static UserModel mapToImpl(CreateOrderRequest userRequest) {
        return UserModel.builder()
                .name(userRequest.getName())
                .age(userRequest.getAge())
                .build();
    }
}
