package com.lab708.employeeservice.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private String name;
    private String phoneNumber;
    private int officeNumber;
    private String position;
    private String manager;
}
