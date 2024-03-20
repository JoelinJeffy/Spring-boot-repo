package com.example.todolist.Controller;

import com.example.todolist.Entity.ListEntity;
import com.example.todolist.Repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ListController {
    ListRepository listRepository;
    @Autowired
    public ListController(ListRepository listRepository)
    {
        this.listRepository=listRepository;
    }
    @GetMapping("/todolist")
    public List<ListEntity> getTheList()
    {
        return listRepository.findAll();
    }
    @GetMapping("/todolist/{id}")
    public ListEntity getById(@PathVariable int id)
    {
        return listRepository.findById(id).get();
    }
    @PostMapping("/addtasks")
    public String addTasks(@RequestBody ListEntity listEntity)
    {
        listRepository.save(listEntity);
        return "Successfully added";
    }
    @PutMapping("/updatetasksbyid/{id}")
    public String updateTasks(@RequestBody ListEntity listEntity,@PathVariable int id)
    {
        ListEntity task=listRepository.findById(id).get();
        task.setTasks(listEntity.getTasks());
        task.setTaskStatus(listEntity.getTaskStatus());
        listRepository.save(task);
        return "Successfully updated";
    }
    @PutMapping("/updatetasksbystatus/{status}")
    public String update(@RequestBody ListEntity listEntity,@PathVariable String status)
    {
        ListEntity task=listRepository.findByStatus(status);
        task.setTaskStatus(listEntity.getTaskStatus());
        task.setTasks(listEntity.getTasks());
        listRepository.save(task);
        return "successfully updated";



    }


}
