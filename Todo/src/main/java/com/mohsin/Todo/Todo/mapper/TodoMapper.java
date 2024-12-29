package com.mohsin.Todo.Todo.mapper;

import com.mohsin.Todo.Todo.Entity.Todo;
import com.mohsin.Todo.Todo.dto.TodoDto;

public class TodoMapper {

    //convert Todo JPA Entity to Todo DTO
    public static TodoDto mapToTodoDto(Todo todo){
        TodoDto todoDto = new TodoDto(
                todo.getId(),
                todo.getTitle(),
                todo.getDescription()
        );

        return todoDto;
    }

// convert todoDto to todo Jpa Entity
public static Todo mapToTodo(TodoDto todoDto){
    Todo todo =new Todo(
            todoDto.getId(),
            todoDto.getTitle(),
            todoDto.getDescription()
    );
    return todo;
}


}
