package com.example.myapp.repositories;

import com.example.myapp.models.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository
        extends CrudRepository<User, Integer> {
  public User findUserByNameAndPassword(String name, String password);
}
