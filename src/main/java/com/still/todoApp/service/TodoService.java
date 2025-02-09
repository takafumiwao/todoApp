package com.still.todoApp.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    public List<String> getAllTodos() {
        return new ArrayList<>();
    }

    public String createTodo(String todo) {
        return "";
    }

    public String updateTodo(Long id) {
        return "";
    }

    public void deleteTodo(Long id) {
        return;
    }
}