package com.rainbow.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/Admin")
public class EmployeeController {

    @GetMapping("/getEmployees")
    public List<Employee> getAllEmployees() {
         List<Employee> employeeList = new ArrayList<>();
        Employee a= new Employee();
        a.setId(1);
        a.setName("Apple");
        a.setRole("Manager");

        employeeList.add(a);

         return employeeList;
    }
}
