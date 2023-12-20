package com.example.demo.application.gateways;

import com.example.demo.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
