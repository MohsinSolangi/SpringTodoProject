package com.mohsin.Todo.Todo.Service.Imp;

import com.mohsin.Todo.Todo.Entity.StatusValue;
import com.mohsin.Todo.Todo.Entity.Todo;
import com.mohsin.Todo.Todo.Repository.StatusRepo;
import com.mohsin.Todo.Todo.Repository.TodoRepo;
import com.mohsin.Todo.Todo.Service.TodoService;
import com.mohsin.Todo.Todo.dto.TodoDto;
import com.mohsin.Todo.Todo.exception.ResourceNotFoundException;
import com.mohsin.Todo.Todo.mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TodoServiceImp implements TodoService {

    @Autowired
    private TodoRepo todoRepo;

    @Autowired
    private StatusRepo statusRepo;


//    @Override
//    public List<Object[]> getTodosWithStatus() {
//        return todoRepo.getTodoWithStatus();
//    }

    @Override
    public Todo createTodo(Todo todo, StatusValue statusValue) {
        //convert DTO to JPA
//        Todo todo = TodoMapper.mapToTodo(todoDto);
//        todo.getStatusvalue();
//        Todo _savedTodo  = todoRepo.save(todo);
//        StatusValue statusValue = StatusValueMapper.mapToStatusValue(statusValueDto);
//        statusValue.getTodo();
//        statusRepo.save(statusValue);
//      TodoDto _savedTodoDto  = TodoMapper.mapToTodoDto(_savedTodo);
        Todo _savedTodo = todoRepo.save(todo);
        return _savedTodo;

    }



    @Override
    public Optional<TodoDto> getTodoById(Long id) {

    Todo todo =todoRepo.findById(id).orElseThrow(
            ()-> new ResourceNotFoundException("Todo","id",id)
    );
        return Optional.of(TodoMapper.mapToTodoDto(todo));
    }

    @Override
    public List<TodoDto> getAllTodos() {
        List<Todo> todos = todoRepo.findAll();

        return todos.stream().map(TodoMapper::mapToTodoDto).collect(Collectors.toList());
    }

    @Override
    public TodoDto updateTodo(TodoDto todoDto) {
Todo todo = todoRepo.findById(todoDto.getId()).orElseThrow(
        ()-> new ResourceNotFoundException("Todo","Id",todoDto.getId())
);

        todo.setTitle(todoDto.getTitle());
        todo.setDescription(todoDto.getDescription());

        Todo savedTodo = todoRepo.save(todo);
        return TodoMapper.mapToTodoDto(savedTodo);

    }

    @Override
    public String deleteTodo(Long id) {

        todoRepo.deleteById(id);
        return "the todo is deleted";
    }
}
