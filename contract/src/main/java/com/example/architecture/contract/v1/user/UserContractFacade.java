package com.example.architecture.contract.v1.user;

import com.example.architecture.contract.v1.user.mapper.UserMapper;
import com.example.architecture.contract.v1.user.model.request.UserRequest;
import com.example.architecture.contract.v1.user.model.response.UserResponse;
import com.example.architecture.impl.user.UserFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserContractFacade {

    private UserFacade facade;

    UserResponse findById(String id) {
        return UserMapper.mapToContract(facade.findById(id));
    }

    UserResponse create(UserRequest user) {
        return UserMapper.mapToContract(facade.create(UserMapper.mapToImpl(user)));
    }
}
