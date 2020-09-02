package com.avalith.challengeJava.controller;

import com.avalith.challengeJava.model.Employee;
import com.avalith.challengeJava.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("")
@RequestMapping("/e")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController (EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @GetMapping ("/")
    public List<Employee> get_all_employee(){
        return this.employeeService.get_all_employee();
    }

    @GetMapping("/{id_employee}")
    public Employee get_by_id (@PathVariable Integer id_employee){
        return this.employeeService.getById(id_employee);
    }

    @PostMapping ("/")
    public void add_employee (@RequestBody Employee one_employee){
        employeeService.add_employee(one_employee);
    }
}
