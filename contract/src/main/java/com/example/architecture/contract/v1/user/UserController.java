package com.example.architecture.contract.v1.user;

import com.example.architecture.contract.v1.user.model.request.UserRequest;
import com.example.architecture.contract.v1.user.model.response.UserResponse;
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

    @GetMapping("/name")
    public String getName() {
        return "Fabio";
    }

    @PostMapping
    public UserResponse create(@RequestBody UserRequest user) {
        return facade.create(user);
    }
}
