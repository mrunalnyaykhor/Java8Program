package com.tech.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Employee {
    private Long employeeId;
    private String employeeName;
    private String employeeAddress;
    private  Long  aadharNumber;
    private String emailId;
    private Double employeeSalary;
    private String employeeHobbies;
    private String department;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", aadharNumber=" + aadharNumber +
                ", emailId='" + emailId + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeHobbies=" + employeeHobbies +
                ", department=" + department +
                '}';
    }




}
