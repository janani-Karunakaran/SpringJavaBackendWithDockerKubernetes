package com.example.interview.service;

import com.example.interview.model.Todo;
import com.example.interview.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepository repo;

    public List<Todo> getListOfToDos() {

//        List<Todo> toDoList=new ArrayList<>();
//
//        LocalTime lt= LocalTime.now();
//        Todo todo=new Todo("Complete Journal Idea","Complete the journal design and start publishing","Not Started",lt);
//
//        toDoList.add(todo);
//    return toDoList;
       return repo.findAll();

    }

    public Todo addNewTodo(Todo todo) {
        //System.out.println(todo.toString());
        repo.save(todo);
        return todo;
    }

    public Todo updateNewTodo(Todo updatedTodo) {
        System.out.println(updatedTodo.toString());
        repo.save(updatedTodo);
        return updatedTodo;
    }

    public Todo updateNewTodo(String status,String title) {
        LocalTime lt= LocalTime.now();
        Todo todo=new Todo("Complete Journal Idea","Complete the journal design and start publishing",status,lt);
        System.out.println("New Status - "+status+" for the title- "+title);
        repo.save(todo);
        return todo;
    }
}
