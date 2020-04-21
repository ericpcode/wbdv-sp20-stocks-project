//package com.example.myapp.repositories;
//
//import com.example.myapp.models.User;
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//
//import java.util.List;
//
//public interface UserRepository
//        extends CrudRepository<User, Integer> {
//
//  @Query("SELECT user FROM User topic")
//  public List<User> findAllTopics();
//
//  @Query("SELECT topic FROM Topic topic WHERE topic.lessonId=:lid")
//  public List<User> findTopicsForLesson(
//          @Param("lid") String lessonId);
//
//
//  @Query("SELECT topic FROM Topic topic WHERE topic.id=:tid")
//  public User findTopicById(
//          @Param("tid") Integer tid);
//
//}
