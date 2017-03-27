package com.endava.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by sbogdanschi on 27/03/2017.
 */
public class EmployeeList {
    private List<Employee> employees;

    public EmployeeList() {
        //empty constructor
    }

    public EmployeeList(List<Employee> employees) {
        this.employees = new ArrayList<Employee>(employees);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeList that = (EmployeeList) o;
        return Objects.equals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employees);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeList{");
        sb.append("employees=").append(employees).append("\n");
        sb.append('}');
        return sb.toString();
    }
}
