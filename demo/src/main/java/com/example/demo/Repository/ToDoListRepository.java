package com.example.demo.Repository;

import com.example.demo.Model.ToDoListModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToDoListRepository extends JpaRepository<ToDoListModel,Long> {

    // List<ToDoListModel> getAllTask();
    // List<ToDoListModel> getTaskById(int id);
    // List<ToDoListModel> createTask(ToDoListModel task);
    // List<ToDoListModel> updateTask(int id);
    // List<ToDoListModel> deleteTask(int id);
    List<ToDoListModel> getALlTaskByDone();
}
