package com.example.hotel2.services;

import com.example.hotel2.entities.Department;
import com.example.hotel2.repositories.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo repo;

    public List<Department> viewAll(){
        return repo.findAll();
    }

    public Department create(Department department){
        return repo.save(department);
    }
}
