package tech.jplopes.todolist.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.jplopes.todolist.domain.Task;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TodoListController {

    private List<Task> tasks = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Task>> listTasks(){
        return ResponseEntity.ok(tasks);

    }

    @PostMapping
    public void createTask(@RequestBody Task task){
        tasks.add(task);
    }

}
