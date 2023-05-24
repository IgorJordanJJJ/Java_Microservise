package org.example.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ToDoSercvise {
    private List<Todo> todos =new ArrayList<>(
            Arrays.asList(
                    new Todo(1,"task_1","summaru_1","desc_1"),
                    new Todo(2,"task_2","summaru_2","desc_2"),
                    new Todo(3,"task_3","summaru_3","desc_3"),
                    new Todo(4,"task_4","summaru_4","desc_4")
            )
    );

    public List<Todo> getAllTodos() {
        return todos;
    }

    public Todo getTodo(Integer id) {
        return todos.stream().filter(todo -> todo.getId().equals(id)).findFirst().get();
    }

    public void createTodo(Todo todo) {
        todos.add(todo);
    }
}
