package org.example.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    private ToDoSercvise toDoSercvise;
    @RequestMapping("/todos")
    public List<Todo> getAllToDos(){
        return toDoSercvise.getAllTodos();
    }

    @RequestMapping("/todos/{id}")
    public Todo getTodo(@PathVariable Integer id){
        return toDoSercvise.getTodo(id);
    }

    @RequestMapping(method = RequestMethod.POST, value ="/todos")
    public void createTodo(@RequestBody Todo todo){
        toDoSercvise.createTodo(todo);
    }
}
