package com.felipelohan.todo.service;

import com.felipelohan.todo.model.TodoEntity;
import com.felipelohan.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }


    public TodoEntity save(TodoEntity todo){
        return repository.save(todo);
    }

    public TodoEntity update(TodoEntity todo){
        return repository.save(todo);
    }

    public List<TodoEntity> showAll(){
        return repository.findAll();
    }


    public TodoEntity showById(Integer id){
        return repository.findById(id).orElse(null);
    }
}
