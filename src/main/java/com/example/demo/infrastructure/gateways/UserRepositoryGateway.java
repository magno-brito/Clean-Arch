package com.example.demo.infrastructure.gateways;

import com.example.demo.application.gateways.UserGateway;
import com.example.demo.domain.entity.User;
import com.example.demo.infrastructure.persistence.UserEntity;
import com.example.demo.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper){
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }
    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity savebObj = userRepository.save(userEntity);
        return userEntityMapper.toDomainObj(savebObj);
    }
}
