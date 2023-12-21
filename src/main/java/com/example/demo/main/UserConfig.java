package com.example.demo.main;


import com.example.demo.application.gateways.UserGateway;
import com.example.demo.application.usescases.CreateUserInteractor;
import com.example.demo.infrastructure.controllers.UserDTOMapper;
import com.example.demo.infrastructure.gateways.UserEntityMapper;
import com.example.demo.infrastructure.gateways.UserRepositoryGateway;
import com.example.demo.infrastructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }
}
