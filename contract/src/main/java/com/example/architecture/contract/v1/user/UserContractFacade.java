package com.example.architecture.contract.v1.user;

import com.example.architecture.contract.v1.user.mapper.UserMapper;
import com.example.architecture.contract.v1.user.model.request.UserRequest;
import com.example.architecture.contract.v1.user.model.response.UserResponse;
import com.example.architecture.impl.ImplFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserContractFacade {

    private ImplFacade implFacade;

    UserResponse findById(String id) {
        return UserMapper.mapToContract(implFacade.user().findById(id));
    }

    UserResponse create(UserRequest user) {
        implFacade.order().find("OI");
        return UserMapper.mapToContract(implFacade.user().create(UserMapper.mapToImpl(user)));
    }

}
