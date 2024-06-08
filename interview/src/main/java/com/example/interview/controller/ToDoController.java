package com.example.interview.controller;

import com.example.interview.model.Todo;
import com.example.interview.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    TodoService service;

    @GetMapping("/toDo")
    public List<Todo> getToDo(){
        return service.getListOfToDos();
    }

    @GetMapping("/todoWithAuth")
    public List<Todo> getToDoWithAuth(){
        return service.getListOfToDos();
    }


    @PostMapping("/addtodo")
    public Todo addToDo(@RequestBody Todo newTodo){
        return service.addNewTodo(newTodo);
    }

    @PutMapping("/updatetodo")
    public Todo updateTodo(@RequestBody Todo updatedTodo){
        return service.updateNewTodo(updatedTodo);
    }

    @PutMapping("/updatetodo/{title}")
    public Todo updateTodoWithParam(@RequestParam String status,@PathVariable String title){
        return service.updateNewTodo(status,title);
    }

}
