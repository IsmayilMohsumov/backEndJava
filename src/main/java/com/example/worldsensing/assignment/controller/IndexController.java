package com.example.worldsensing.assignment.controller;

import com.example.worldsensing.assignment.model.Configurations;
import com.example.worldsensing.assignment.repository.ConfigurationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/configs")
public class IndexController {

    @Autowired
    private ConfigurationsRepository repository;

    @GetMapping
    public List<Configurations> getAll(){
        return repository.findAll();
    }

    @PostMapping
    public void addConfig(@RequestBody Configurations configurations){
        repository.save(configurations);
    }

    @DeleteMapping(path = "/{id}")
    public  Configurations getById(@PathVariable("id") Integer id){
        return repository.getById(id);
    }


}
