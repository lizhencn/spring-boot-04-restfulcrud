package com.edu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping
    public String getEmployees(Model model){

        model.addAttribute("emps","emps");
        return "emp/list";
    }
}
