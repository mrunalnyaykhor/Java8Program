package com.tech.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private Long employeeId;
    private String employeeName;
    private String employeeAddress;
    private  Long  aadharNumber;
    private String emailId;
    private Double employeeSalary;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", aadharNumber=" + aadharNumber +
                ", emailId='" + emailId + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
