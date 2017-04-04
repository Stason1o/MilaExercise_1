package part1.com.endava.main;

import part1.com.endava.entity.EmployeeList;
import part1.com.endava.entity.Worker;
import part1.com.endava.entity.enums.Country;
import part1.com.endava.service.EmployeeService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by sbogdanschi on 27/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        EmployeeList employeeMap = new EmployeeList();

        employeeMap.getWorkerMap().entrySet().forEach(System.out::println);

        System.out.println("------------------------------------");
        employeeService.sortList(employeeMap.getWorkerMap()).entrySet().forEach(System.out::println);


        Set<Worker> emplSet;

        emplSet = employeeService.workersReadyForTrip(
                employeeMap.getWorkerMap(),
                LocalDateTime.of(1970, 12, 30, 12, 30),
                LocalDateTime.of(1990, 11, 24, 10, 45)
        );
        System.out.println(emplSet);

        List<Country> allowedCountries = new ArrayList<Country>() {{
            add(Country.FRANCE);
            add(Country.USA);
            add(Country.ALGIR);
            add(Country.CANADA);
        }};


        System.out.println(employeeService.possibilityToVisitCountry(employeeMap.getWorkerMap().get(1), allowedCountries));

        Map<Country, List<Worker>> unmodifiableMap =
                employeeService.createFinalCollectionToStoreCountryAndWorkers(Country.USA, employeeMap.getWorkerMap());

        System.out.println("-----------------------------------------------------");
        System.out.println(unmodifiableMap);

    }
}
