package com.mohsin.Todo.Todo.Repository;

import com.mohsin.Todo.Todo.Entity.Todo;

import com.mohsin.Todo.Todo.dto.TodoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepo extends JpaRepository<Todo,Long> {

//    @Query("Select u.userName,e.firstName from User u LEFT JOIN u.employee e " +
//            "Where u.userName = :userName")
//    List<Object[]> getUsersDatabyQueryName(@Param("userName") String username);


//    @Query("Select t.title,t.description, s.status from todo t JOIN t.status_value s " +
//            "Where t.completed =s.id ")
//    List<Object[]> getTodoWithStatus();

//    @Query("SELECT new com.mohsin.Todo.Todo.Dto.TodoStatusDto(t.title, t.description, s.status) " +
//            "FROM Todo t " +
//            "JOIN t.statusValue s " +
//            "WHERE t.completed = s.id")
//    List<TodoDto> getTodoWithStatus();



}


