package com.example.myapp.services;

import com.example.myapp.models.Stock;
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

  public User findUserByCredentials(User user) {
    return userRepository.findUserByNameAndPassword(user.getName(), user.getPassword());
  }

  public int saveStock(User user, Stock stock) {
    User savedUser = userRepository.findById(user.getId()).get();
    savedUser.getStocks().add(stock);
    userRepository.save(savedUser);
    return 1;
  }

  public int deleteStock(User user, String stockSymbol) {
    User savedUser = userRepository.findById(user.getId()).get();
    savedUser.getStocks().removeIf(s -> stockSymbol.equals(s.getSymbol()));
    userRepository.save(savedUser);
    return 1;
  }

  public User findUserById(Integer userId){
    return userRepository.findById(userId).get();

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
