package com.mohsin.Todo.Todo.Service;

import com.mohsin.Todo.Todo.Entity.StatusValue;
import com.mohsin.Todo.Todo.Entity.Todo;
import com.mohsin.Todo.Todo.dto.TodoDto;

import java.util.List;
import java.util.Optional;

public interface TodoService {


//    List<Object[]> getTodosWithStatus();
     Todo createTodo(Todo todo, StatusValue statusValue);
    Optional<TodoDto> getTodoById(Long id);

    List<TodoDto> getAllTodos();

    TodoDto updateTodo(TodoDto todoDto);
    String deleteTodo(Long id);
}
