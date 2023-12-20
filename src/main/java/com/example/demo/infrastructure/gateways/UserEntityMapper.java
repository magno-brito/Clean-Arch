package com.example.demo.infrastructure.gateways;

import com.example.demo.domain.entity.User;
import com.example.demo.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObjs) {
        return new UserEntity(
                userDomainObjs.username(),
                userDomainObjs.password(),
                userDomainObjs.email());
    }
    User toDomainObj(UserEntity userEntity) {
        return new User(
                userEntity.getUsername(),
                userEntity.getPassword(),
                userEntity.getEmail());
    }
}
