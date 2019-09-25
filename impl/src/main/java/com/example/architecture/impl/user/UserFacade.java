package com.example.architecture.impl.user;

import com.example.architecture.impl.user.model.UserModel;
import com.example.architecture.impl.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserFacade {

    private UserService service;

    public UserModel findById(String id) {
        return service.findById(id);
    }

    public UserModel create(UserModel user) {
        return service.create(user);
    }
}
