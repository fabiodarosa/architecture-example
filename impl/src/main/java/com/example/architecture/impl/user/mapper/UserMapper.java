package com.example.architecture.impl.user.mapper;

import com.example.architecture.impl.user.model.UserModel;
import com.example.architecture.impl.user.repository.UserEntity;

public class UserMapper {
    public static UserModel mapToModel(UserEntity userEntity) {
        return UserModel.builder()
                .id(userEntity.getId())
                .name(userEntity.getName())
                .age(userEntity.getAge())
                .build();
    }

    public static UserEntity mapToEntity(UserModel userModel) {
        return UserEntity.builder()
                .id(userModel.getId())
                .name(userModel.getName())
                .age(userModel.getAge())
                .build();
    }
}


