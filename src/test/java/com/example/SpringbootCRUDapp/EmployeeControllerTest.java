package com.example.SpringbootCRUDapp;


import com.example.SpringbootCRUDapp.controller.EmployeeController;
import com.example.SpringbootCRUDapp.model.Employee;
import com.example.SpringbootCRUDapp.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
public class EmployeeControllerTest {

    private MockMvc mockMvc;

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private EmployeeController employeeController;

    ObjectMapper objectMapper = new ObjectMapper();
    ObjectWriter objectWriter = objectMapper.writer();

    Employee employeeA = new Employee(1,"Kevin", "G", "kg@gmail.com");
    Employee employeeB = new Employee(2,"Kevin2", "G2", "kg@gmail.com2");
    Employee employeeC = new Employee(3,"Kevin3", "G3", "kg@gmail.com3");


    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();

    }



    @Test
    public void getAllRecordsTest () throws Exception {
        List<Employee> employees = new ArrayList<>(Arrays.asList(employeeA,employeeB,employeeC));

        Mockito.when(employeeService.getAllEmployees()).thenReturn(employees);

        mockMvc.perform(MockMvcRequestBuilders
                .get("/")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }





}
