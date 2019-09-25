package com.example.architecture.impl.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class UserModel {
    private String id;
    private String name;
    private Integer age;
}
