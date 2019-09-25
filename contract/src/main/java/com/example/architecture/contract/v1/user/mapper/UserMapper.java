package com.example.architecture.contract.v1.user.mapper;

import com.example.architecture.contract.v1.user.model.request.UserRequest;
import com.example.architecture.contract.v1.user.model.response.UserResponse;
import com.example.architecture.impl.user.model.UserModel;

public class UserMapper {

    public static UserResponse mapToContract(UserModel userModel) {
        return UserResponse.builder()
                .id(userModel.getId())
                .name(userModel.getName())
                .age(userModel.getAge())
                .build();
    }

    public static UserModel mapToImpl(UserRequest userRequest) {
        return UserModel.builder()
                .name(userRequest.getName())
                .age(userRequest.getAge())
                .build();
    }
}
