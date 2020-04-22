package com.example.myapp.controllers;


import com.example.myapp.models.Stock;
import com.example.myapp.models.User;
import com.example.myapp.services.StockService;
import com.example.myapp.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class UserController {
  @Autowired
  UserService userService;
  @Autowired
  StockService stockService;


  @PostMapping("/register")
  public User createUser(
          HttpSession session,
          @RequestBody User newUser) {
    User createdUser = userService.createUser(newUser);
    createdUser.setPassword("*");
    session.setAttribute("user", createdUser);
    return createdUser;
  }

  @PostMapping("/login")
  public User loginUser(
          HttpSession session,
          @RequestBody User user) {
    User foundUser = userService.findUserByCredentials(user);
    foundUser.setPassword("*");
    session.setAttribute("user", foundUser);
    return foundUser;
  }

  @PostMapping("/logout")
  public void logout(HttpSession session) {
    session.invalidate();
  }

  @PostMapping("/stocks")
  public int saveStock(HttpSession session, @RequestBody Stock stock) {
    return stockService.saveStock((User)session.getAttribute("user"), stock);
  }

  @DeleteMapping("/stocks/{stockSymbol}")
  public int deleteStock(HttpSession session, @PathVariable("stockSymbol") String stockSymbol) {
    return stockService.deleteStock((User)session.getAttribute("user"), stockSymbol);
  }

  @GetMapping("/api/topics/{userId}")
  public User findUserById(
          @PathVariable("userId") Integer tid) {
    return userService.findUserById(tid);
  }

  @GetMapping("/api/topics")
  public List<User> findAllUsers() {
    return userService.findAllUsers();
  }


  @PutMapping("/api/topics/{topicId}")
  public int updateUser(
          @PathVariable("topicId") Integer tid, @RequestBody User updatedTopic) {
    return userService.updateUser(tid, updatedTopic);
  }

  @DeleteMapping("/api/topics/{topicId}")
  public int deleteUser(
          @PathVariable("topicId") Integer uid) {
    return userService.deleteUser(uid);
  }



}
