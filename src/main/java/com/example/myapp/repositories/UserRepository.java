package com.example.myapp.repositories;

import com.example.myapp.models.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository
        extends CrudRepository<User, Integer> {
  public User findUserByNameAndPassword(String name, String password);
}
