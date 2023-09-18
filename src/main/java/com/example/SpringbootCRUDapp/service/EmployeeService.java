package com.example.SpringbootCRUDapp.service;

import com.example.SpringbootCRUDapp.model.Employee;
import com.example.SpringbootCRUDapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface EmployeeService {
    @Autowired
    private EmployeeRepository eymployeeRepository;

    @Override
    public List<Employee> getAllEmployees();
        return List<Employee>.findAll();
}
