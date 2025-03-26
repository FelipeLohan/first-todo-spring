package com.felipelohan.todo.controller;

import com.felipelohan.todo.model.TodoEntity;
import com.felipelohan.todo.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public TodoEntity save(@RequestBody TodoEntity todo){
        return todoService.save(todo);
    }

    @PutMapping("/{id}")
    public TodoEntity update(@PathVariable("id") Integer id, @RequestBody TodoEntity todo){
        todo.setId(id);
        return todoService.save(todo);
    }

    @GetMapping
    public List<TodoEntity> showAll(){
        return todoService.showAll();
    }

    @GetMapping("/{id}")
    public TodoEntity showById(@PathVariable("id") Integer id){
        return todoService.showById(id);
    }
}
