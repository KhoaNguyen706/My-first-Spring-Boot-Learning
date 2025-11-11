package com.example.demo.Controller;

import com.example.demo.Model.ToDoListModel;
import com.example.demo.Service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/list")
public class ToDoListController {

    @Autowired
    public ToDoListService toDoListService;

    @GetMapping
    public ResponseEntity<List<ToDoListModel>> getAllTask(){
        return ResponseEntity.ok(toDoListService.getAllTask());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ToDoListModel> getATask(@PathVariable long id){
        return toDoListService.getTaskById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ToDoListModel> createATask(@RequestBody ToDoListModel toDoListModel){
        ToDoListModel task = toDoListService.createATask(toDoListModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(task);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ToDoListModel> updateATask(@PathVariable long id,@RequestBody ToDoListModel task){
        try{
            ToDoListModel updated = toDoListService.updateTask(id, task);
            return ResponseEntity.ok(updated);
        }catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        try {
            toDoListService.deletebyId(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

}
