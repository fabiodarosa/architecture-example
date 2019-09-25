package com.example.architecture.impl.user.service;

import com.example.architecture.impl.user.mapper.UserMapper;
import com.example.architecture.impl.user.model.UserModel;
import com.example.architecture.impl.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.InputMismatchException;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository repository;


    public UserModel findById(String id) {
        return UserMapper.mapToModel(repository.findById(id).orElseThrow(InputMismatchException::new));
    }

    public UserModel create(UserModel user) {
        return UserMapper.mapToModel(repository.save(UserMapper.mapToEntity(user)));
    }

    @PostConstruct
    public void setup() {
        System.out.println("Bombou");
    }
}
