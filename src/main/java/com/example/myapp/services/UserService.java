//package com.example.myapp.services;
//
//import com.example.myapp.models.User;
//import com.example.myapp.repositories.UserRepository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserService {
//  @Autowired
//  UserRepository userRepository;
//
//
//  public User createTopic(User newUser) {
//    return userRepository.save(newUser);
//  }
//
//  public List<User> findTopicsForLesson(String lid) {
//    return userRepository.findTopicsForLesson(lid);
//
//  }
//
//  public int updateUser(int uid, User newTopic) {
//    userRepository.save(newTopic);
//    return 1;
//  }
//
//  public int deleteUser(int uid) {
//    userRepository.deleteById(uid);
//    return 1;
//  }
//
//  public List<User> findAllUsers(){
//    return (List<User>)userRepository.findAll();
//  }
//
//
//
//  public User findTopicById(Integer topicId){
//    return userRepository.findTopicById(topicId);
//
//  }
//
//
//}
