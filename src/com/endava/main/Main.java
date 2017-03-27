package com.endava.main;

import com.endava.entity.EmployeeList;
import com.endava.entity.Worker;
import com.endava.service.EmployeeService;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by sbogdanschi on 27/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        EmployeeList employeeMap = new EmployeeList(employeeService.createEmployees());

        System.out.println(employeeMap);

        List<Map.Entry<LocalDateTime, Worker>> list = new LinkedList<>(employeeMap.getWorkerMap().entrySet());

        System.out.println("------------------------------------");

        employeeService.sortList(list);

        System.out.println(list);

        Set<Worker> emplSet;

        emplSet = employeeService.workersReadyForTrip(
                employeeMap.getWorkerMap(),
                LocalDateTime.of(1970, 12, 30, 12, 30),
                LocalDateTime.of(1990, 11, 24, 10, 45)
        );
        System.out.println(emplSet);

        List<String> allowedCountries = new ArrayList<String>() {{
            add("France");
            add("Usa");
            add("Italy");
            add("Canada");
        }};

        List<Worker> workersToVisitSpecificCountry = new ArrayList<Worker>() {{
            add(list.get(0).getValue());
            add(list.get(10).getValue());
            add(list.get(5).getValue());
            add(list.get(15).getValue());
        }};

        List<Worker> workersToVisit = new ArrayList<Worker>() {{
            add(list.get(1).getValue());
            add(list.get(11).getValue());
            add(list.get(6).getValue());
            add(list.get(17).getValue());
        }};

        System.out.println(employeeService.possibilityToVisitCountry(list.get(1).getValue(), allowedCountries));

        Map<String, List<Worker>> finalMap =
                employeeService.createFinalCollectionToStoreCountryAndWorkers("Usa", workersToVisitSpecificCountry);

        System.out.println("-----------------------------------------------------");
        System.out.println(finalMap);

        finalMap.put("qwerty", workersToVisit);
        System.out.println("--------------------------------------------------------");
        System.out.println(finalMap);
    }
}
