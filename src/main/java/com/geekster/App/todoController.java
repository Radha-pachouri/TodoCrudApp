package com.geekster.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class todoController {
    @Autowired
    List<todo> todoList;

    @PostMapping("todo")
    public String addTodo(@RequestBody todo todo){
        todoList.add(todo);
        return "todo added";
    }

    @GetMapping("getAllTodos")
    public List<todo> getTodo(){
        return todoList;
    }

    @PutMapping("todo/id/{id}/status")
    public String setTodoStatusById(@PathVariable Integer id ,@RequestParam boolean flag){
        for(com.geekster.App.todo todo : todoList){
            if(todo.getTodoId().equals(id)){
                todo.setTodoStatus(flag);
                return "todo :"+ id +"updated to "+ flag;
            }
        }
        return "Invalid id";
    }
    @DeleteMapping("todo/id/{id}")
    public String removeTodoById(@PathVariable Integer id){
        for(com.geekster.App.todo todo : todoList){
            if(todo.getTodoId().equals(id)){
                todoList.remove(todo);
                return "todo : "+ id + "removed";
            }
        }
        return "Invalid id";
    }
}
