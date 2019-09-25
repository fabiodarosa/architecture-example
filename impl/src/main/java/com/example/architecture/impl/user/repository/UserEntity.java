package com.example.architecture.impl.user.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserEntity {

    private String id;
    private String name;
    private Integer age;
}
