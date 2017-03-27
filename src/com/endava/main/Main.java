package com.endava.main;

import com.endava.entity.Employee;
import com.endava.entity.EmployeeList;
import com.endava.service.EmployeeService;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * Created by sbogdanschi on 27/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        EmployeeList list = new EmployeeList(employeeService.createEmployees());
        //System.out.println(list);

        //System.out.println(employeeService.sortList(list.getEmployees()));
        Set<Employee> emplSet;

        emplSet = employeeService.workersReadyForTrip(
                list.getEmployees(),
                LocalDateTime.of(1970, 12, 30, 12, 30),
                LocalDateTime.of(1990, 11, 24, 10, 45)
        );
        System.out.println(emplSet);
    }
}
