package com.lab708.employeeservice;

import com.lab708.employeeservice.controller.impl.EmployeeRepository;
import com.lab708.employeeservice.dao.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Data {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void populate() {
        List<Employee> opportunities = employeeRepository.saveAll(List.of(
                new Employee(1l, "John Buck", "123-456-785", 101, "Senior Analyst", "Mr Brown"),
                new Employee(2l, "Elsa White", "345-783-399", 23, "IT Engineer", "Mr Orwell"),
                new Employee(3l, "Bill Murray", "554-978-349", 92, "Office Assistant", "Mr Brown")
        ));
    }
}
