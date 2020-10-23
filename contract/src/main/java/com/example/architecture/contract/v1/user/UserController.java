package com.example.architecture.contract.v1.user;

import com.example.architecture.contract.v1.user.model.request.UserRequest;
import com.example.architecture.contract.v1.user.model.response.UserResponse;
import com.example.architecture.impl.user.model.UserModel;
import com.example.architecture.impl.user.repository.UserEntity;
import com.example.architecture.impl.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1/users")
@RestController
@AllArgsConstructor
public class UserController {

    private UserContractFacade facade;

    private UserRepository userRepository;

    @GetMapping("/{id}")
    public UserResponse findById(@PathVariable String id) {
        return facade.findById(id);
    }

    @PostMapping
    public UserResponse create(@RequestBody UserRequest user) {
        return facade.create(user);
    }

    @GetMapping("/user/{id}")
    public UserModel findUser(@PathVariable String id) {
        UserEntity byId = userRepository.findById(id).orElseThrow(() -> new RuntimeException("ClientNotFound"));
        if (byId == null) return null;
        return new UserModel(byId.getId(), byId.getName(), byId.getAge());
    }

    @ExceptionHandler(RuntimeException.class)
    public String handle(RuntimeException e) {
        return e.getMessage();
    }
}
