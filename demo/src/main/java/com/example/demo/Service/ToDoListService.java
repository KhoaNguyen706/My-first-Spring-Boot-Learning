package com.example.demo.Service;

import com.example.demo.Model.ToDoListModel;
import com.example.demo.Repository.ToDoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public abstract class ToDoListService implements ToDoListRepository {

    @Autowired
    private ToDoListRepository todolistRepository;

    public List<ToDoListModel> getAllTask(){
        return todolistRepository.findAll();
    }
    public Optional<ToDoListModel> getTaskById(long id){
        return todolistRepository.findById(id);
    }
    public ToDoListModel createATask(ToDoListModel toDoListModel){
        return todolistRepository.save(toDoListModel);
    }

    public ToDoListModel updateTask(long id,ToDoListModel toDoListModel){
        return todolistRepository.findById(id).map(existTask->{
            existTask.setTitle(toDoListModel.getTitle());
            existTask.setDescription(toDoListModel.getDescription());
            existTask.setCompleted(toDoListModel.isCompleted());

            return todolistRepository.save(existTask);
        }).orElseThrow(() -> new RuntimeException("Task not found"));
    }
    
    public void deletebyId(long id){
        todolistRepository.deleteById(id);
    }

    
}
