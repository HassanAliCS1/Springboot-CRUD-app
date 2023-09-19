package com.example.SpringbootCRUDapp.service;

import com.example.SpringbootCRUDapp.controller.EmployeeController;
import com.example.SpringbootCRUDapp.model.Employee;
import com.example.SpringbootCRUDapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public interface EmployeeService {


    public List<Employee> getAllEmployees();


    void saveEmployee(Employee employee);

    Employee getEmployeeByID(long ID);

    void deleteEmployeeById(long id);

}
