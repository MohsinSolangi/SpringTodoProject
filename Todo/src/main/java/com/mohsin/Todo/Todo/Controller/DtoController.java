package com.mohsin.Todo.Todo.Controller;

import com.mohsin.Todo.Todo.Entity.StatusValue;
import com.mohsin.Todo.Todo.Entity.Todo;
import com.mohsin.Todo.Todo.Repository.TodoRepo;
import com.mohsin.Todo.Todo.Service.TodoService;
import com.mohsin.Todo.Todo.dto.StatusValueDto;
import com.mohsin.Todo.Todo.dto.TodoDto;
import com.mohsin.Todo.Todo.mapper.StatusValueMapper;
import com.mohsin.Todo.Todo.mapper.TodoMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/apis")
public class DtoController {

    @Autowired
    private TodoService todoService;

    @Autowired
    private TodoRepo todoRepo;

    @PostMapping("/createTodo")
    public ResponseEntity<Todo> createTodo (@RequestBody @Valid Todo todo){

//        Todo todo = TodoMapper.mapToTodo(todoDto);
        StatusValue statusValue = todo.getStatusvalue();
        statusValue.setTodo(todo);
//TodoDto todoDto2= TodoMapper.mapToTodoDto(todo);
//        StatusValueDto statusValueDto1 = StatusValueMapper.mapToStatusValueDto(statusValue);
    Todo _savedTodo = todoService.createTodo(todo,statusValue);

    return new ResponseEntity<>(_savedTodo,HttpStatus.CREATED);

    }

    @GetMapping("/todoId/{Id}")
    public ResponseEntity<Optional<TodoDto>> getTodoById(@PathVariable("Id") Long Id){
        Optional<TodoDto> todoDto = todoService.getTodoById(Id);
        return ResponseEntity.ok(todoDto);
    }
//    @GetMapping("/showAllTodosWithStatus")
//    public ResponseEntity<List<Object[]>> getTodosWithStatus() {
//        List<Object[]> todosWithStatus = todoService.getTodosWithStatus();
//        return ResponseEntity.ok(todosWithStatus);
//    }


    @GetMapping("/showAllTodos")
    public ResponseEntity<List<TodoDto>> showAllTodos(){
        List<TodoDto> todoDtos = todoService.getAllTodos();
        return ResponseEntity.ok(todoDtos);
    }


    @PutMapping("/update/TodoId/{Id}")
    public ResponseEntity<TodoDto> updateTodoById(@RequestBody @Valid  TodoDto todoDto,
                                                  @PathVariable("Id") Long Id){
        todoDto.setId(Id);
        TodoDto _updatedTodo = todoService.updateTodo(todoDto);
        return ResponseEntity.ok(todoDto);
    }

    @DeleteMapping("/deleteTodo/{id}")
    public String deleteTodoBy(@PathVariable Long id ){
        return todoService.deleteTodo(id);
    }

}
