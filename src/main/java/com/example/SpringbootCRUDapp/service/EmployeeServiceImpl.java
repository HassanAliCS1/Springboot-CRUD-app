package com.example.SpringbootCRUDapp.service;

import java.util.List;

import com.example.SpringbootCRUDapp.service.EmployeeService;
import com.example.SpringbootCRUDapp.model.Employee;
import com.example.SpringbootCRUDapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee){
        this.employeeRepository.save(employee);
    }


}
