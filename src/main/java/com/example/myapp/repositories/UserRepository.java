package com.example.myapp.repositories;

import com.example.myapp.models.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository
        extends CrudRepository<User, Integer> {

  @Query("SELECT user FROM User user")
  public List<User> findAllTopics();


  @Query("SELECT user FROM User user WHERE user.id=:id")
  public User findUserById(
          @Param("uid") Integer uid);

}
