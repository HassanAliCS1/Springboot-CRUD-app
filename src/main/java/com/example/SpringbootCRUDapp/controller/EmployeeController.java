package com.example.SpringbootCRUDapp.controller;

import com.example.SpringbootCRUDapp.model.Employee;
import com.example.SpringbootCRUDapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //display list of employees
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listEmployees",employeeService.getAllEmployees());
        return "index";

    }

    @PostMapping("/addSampleEmployee")
    public String addSampleEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Sample");
        employee.setLastName("Employee");
        employee.setEmail("sample.employee@mycompany.com");
        employeeService.saveEmployee(employee);
        return "index";
    }
}
