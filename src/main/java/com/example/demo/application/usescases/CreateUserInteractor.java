package com.example.demo.application.usescases;

import com.example.demo.application.gateways.UserGateway;
import com.example.demo.domain.entity.User;

//Works as a Service
public class CreateUserInteractor {

    private UserGateway userGateway;
    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }
    public User createUser(User user) {
        return userGateway.createUser(user);

    }
}
