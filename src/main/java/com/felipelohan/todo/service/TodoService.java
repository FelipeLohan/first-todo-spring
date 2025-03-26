package com.felipelohan.todo.service;

import com.felipelohan.todo.model.TodoEntity;
import com.felipelohan.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public TodoEntity save(TodoEntity todo){
        return repository.save(todo);
    }
}
