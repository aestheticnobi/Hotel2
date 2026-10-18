package com.example.hotel2.controllers;

import com.example.hotel2.entities.Department;
import com.example.hotel2.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/dept")
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping("/reg")
    public String register(Model model){
        model.addAttribute("department", new Department());
        return "department_reg.html";
    }

    @PostMapping("/reg")
    public String registerForm( Department department, Model model){
        service.create(department);
        return "redirect:/dept/view";
    }

    @GetMapping("/view")
    public String view(Model model){
        model.addAttribute("dept", service.viewAll());
        return "departmentView.html";
    }


}
