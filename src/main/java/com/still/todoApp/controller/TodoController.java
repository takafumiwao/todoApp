package com.still.todoApp.controller;

import com.still.todoApp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<String> getAllTodos() {
        return todoService.getAllTodos();
    }

    @PostMapping
    public String createTodo(@RequestBody String todo) {
        return todoService.createTodo(todo);
    }

    @PutMapping("/{id}")
    public String updateTodo(@PathVariable Long id) {
        return todoService.updateTodo(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }
}