package com.endava.service;

import com.endava.entity.Employee;
import com.endava.entity.Worker;
import com.endava.entity.enums.Status;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by sbogdanschi on 27/03/2017.
 */
public class EmployeeService {

    Set<Employee> employeeSet;
    Comparator<Employee> comparator = (o1, o2) -> o1.getLocalDateTime().compareTo(o2.getLocalDateTime());

    public EmployeeService() {
        //empty constructor
    }

    public List<Employee> createEmployees() {
        return new ArrayList<Employee>() {{
            add(new Employee(LocalDateTime.of(1960, 3, 13, 11, 5), new Worker("Valera", "Valerovici", (byte) 57, Status.READY)));
            add(new Employee(LocalDateTime.of(1970, 4, 12, 12, 0), new Worker("Petea", "ethbnrb", (byte) 47, Status.READY)));
            add(new Employee(LocalDateTime.of(1980, 5, 16, 14, 50), new Worker("Vasea", "rstjnsrn", (byte) 37, Status.NOT_READY)));
            add(new Employee(LocalDateTime.of(1990, 6, 13, 10, 43), new Worker("Anton", "eahbstrn", (byte) 27, Status.READY)));
            add(new Employee(LocalDateTime.of(1965, 7, 30, 5, 34), new Worker("Andrei", "ymstrhe", (byte) 52, Status.READY)));
            add(new Employee(LocalDateTime.of(1969, 8, 21, 6, 23), new Worker("Mila", "awerghaen", (byte) 48, Status.READY)));
            add(new Employee(LocalDateTime.of(1971, 9, 20, 8, 43), new Worker("June", "aetnsrn", (byte) 46, Status.READY)));
            add(new Employee(LocalDateTime.of(1981, 11, 19, 7, 12), new Worker("Alex", "awrehbstr", (byte) 35, Status.READY)));
            add(new Employee(LocalDateTime.of(1982, 12, 19, 7, 12), new Worker("Alex", "awrehbstr", (byte) 35, Status.READY)));
            add(new Employee(LocalDateTime.of(1983, 10, 19, 7, 12), new Worker("Alex", "awrehbstr", (byte) 35, Status.READY)));
            add(new Employee(LocalDateTime.of(1954, 3, 9, 2, 32), new Worker("Ion", "Valerejet5ryhovici", (byte) 63, Status.NOT_READY)));
            add(new Employee(LocalDateTime.of(1965, 2, 8, 12, 43), new Worker("Vanea", "Valwethtrerovici", (byte) 52, Status.READY)));
            add(new Employee(LocalDateTime.of(1967, 1, 5, 23, 23), new Worker("Vika", "teuyjw4e", (byte) 50, Status.READY)));
            add(new Employee(LocalDateTime.of(1996, 5, 20, 22, 12), new Worker("Kuzea", "qwergeryj", (byte) 21, Status.NOT_READY)));
            add(new Employee(LocalDateTime.of(1960, 3, 4, 19, 14), new Worker("Dima", "tu,dnfgbs", (byte) 57, Status.NOT_READY)));
            add(new Employee(LocalDateTime.of(1979, 6, 6, 17, 15), new Worker("Tanya", "srtjfyum", (byte) 38, Status.READY)));
            add(new Employee(LocalDateTime.of(1983, 8, 1, 15, 39), new Worker("Andreiq", "mdtunsae", (byte) 34, Status.READY)));
            add(new Employee(LocalDateTime.of(1984, 5, 3, 17, 49), new Worker("Ksenia", "mr7y6etmstf", (byte) 33, Status.READY)));
            add(new Employee(LocalDateTime.of(2000, 9, 2, 18, 47), new Worker("Anna", "m46ret5wjrht", (byte) 17, Status.NOT_READY)));
            add(new Employee(LocalDateTime.of(2001, 10, 4, 14, 11), new Worker("Misha", "sryjnt", (byte) 16, Status.NOT_READY)));

        }};
    }



    public List<Employee> sortList(List<Employee> list) {
        list.sort(comparator);
        return list;
    }

    public Set<Employee> workersReadyForTrip(List<Employee> list, LocalDateTime startDate, LocalDateTime endDate) {
        employeeSet = new LinkedHashSet<>();
        for (Employee employee: list){
            if(employee.getLocalDateTime().isBefore(endDate) && employee.getLocalDateTime().isAfter(startDate)){
                employeeSet.add(employee);
            }
        }
//        employeeSet.addAll(list.stream().filter(employee ->
//                employee.getLocalDateTime().isAfter(startDate) &&
//                employee.getLocalDateTime().isBefore(endDate))
//                .collect(Collectors.toList()));
        return employeeSet;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeService{");
        sb.append("employeeSet=").append(employeeSet);
        sb.append('}');
        return sb.toString();
    }
}
