package com.example.myapp.services;

import com.example.myapp.models.User;
import com.example.myapp.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
  @Autowired
  UserRepository userRepository;


  public User createUser(User newUser) {
    return userRepository.save(newUser);
  }
  public User findUserById(Integer topicId){
    return userRepository.findUserById(topicId);

  }

  public List<User> findAllUsers(){
    return (List<User>)userRepository.findAll();
  }

  public int updateUser(int uid, User newName) {
    userRepository.save(newName);
    return 1;
  }

  public int deleteUser(int uid) {
    userRepository.deleteById(uid);
    return 1;
  }







}
