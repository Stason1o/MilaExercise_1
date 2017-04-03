package part1.com.endava.main;

import part1.com.endava.entity.EmployeeList;
import part1.com.endava.entity.Worker;
import part1.com.endava.service.EmployeeService;
import part1.com.endava.util.EmployeeInit;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by sbogdanschi on 27/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        EmployeeList employeeMap = new EmployeeList(EmployeeInit.createEmployees());

        System.out.println(employeeMap);

        List<Map.Entry<LocalDateTime, Worker>> listOfEmployeeMap = new LinkedList<>(employeeMap.getWorkerMap().entrySet());

        System.out.println("------------------------------------");
        employeeService.sortList(listOfEmployeeMap);

        System.out.println(listOfEmployeeMap);

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


        System.out.println(employeeService.possibilityToVisitCountry(listOfEmployeeMap.get(1).getValue(), allowedCountries));

        Map<String, List<Worker>> unmodifiableMap =
                employeeService.createFinalCollectionToStoreCountryAndWorkers("Usa", listOfEmployeeMap);

        System.out.println("-----------------------------------------------------");
        System.out.println(unmodifiableMap);

    }
}
