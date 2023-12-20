package com.example.demo.domain.entity;

//This entity needs to be independent of framework

//Records are used to represent immutable data classes
public record User(String username, String password, String email) {
}
