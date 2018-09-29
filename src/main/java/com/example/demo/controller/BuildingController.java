package com.example.demo.controller;

import com.example.demo.model.Building;
import com.example.demo.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/building")
public class BuildingController {

    @Autowired
    private BuildingRepository buildingRepository;

    @GetMapping
    public List<Building> list() {
        return buildingRepository.findAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Building building) {
        buildingRepository.save(building);
    }

    @GetMapping("/{id}")
    public Building get(@PathVariable("id") long id) {
        return buildingRepository.getOne(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteStudent(@PathVariable long id) {
        buildingRepository.deleteById(id);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll() {
        buildingRepository.deleteAll();
    }

}
