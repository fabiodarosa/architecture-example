package com.example.architecture.contract.v1.user;

import com.example.architecture.contract.v1.user.model.request.UserRequest;
import com.example.architecture.contract.v1.user.model.response.UserResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1/users")
@RestController
@AllArgsConstructor
public class UserController {

    private UserContractFacade facade;

    @GetMapping("/{id}")
    public UserResponse findById(@PathVariable String id) {
        return facade.findById(id);
    }

    @PostMapping
    public UserResponse create(@RequestBody UserRequest user) {
        return facade.create(user);
    }
}
