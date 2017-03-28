package com.endava.service;

import com.endava.entity.Worker;
import com.endava.entity.enums.Capability;
import com.endava.entity.enums.Status;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by sbogdanschi on 27/03/2017.
 */
public class EmployeeService {

    private Set<Worker> employeeSet;
    private static Comparator<Map.Entry<LocalDateTime, Worker>> comparator = Comparator.comparing(Map.Entry::getKey);

    public EmployeeService() {
        //empty constructor
    }

    public Map<LocalDateTime, Worker> createEmployees() {
        return new LinkedHashMap<LocalDateTime, Worker>() {{
            put(LocalDateTime.of(1960, 3, 13, 11, 5),
                    new Worker("Valera", "Valerovici", (byte) 57, Status.READY, new ArrayList<String>() {{
                        add("USA");
                        add("Moldova");
                    }}));
            put(LocalDateTime.of(1970, 4, 12, 12, 0), new Worker("Petea", "ethbnrb", (byte) 47, Status.READY, new ArrayList<String>() {{
                add("USA");
                add("London");
            }}));
            put(LocalDateTime.of(1980, 5, 16, 14, 50), new Worker("Vasea", "rstjnsrn", (byte) 37, Status.NOT_READY, new ArrayList<String>() {{
                add("Moldova");
                add("PAris");
                add("Monaco");
            }}));
            put(LocalDateTime.of(1990, 6, 13, 10, 43), new Worker("Anton", "eahbstrn", (byte) 27, Status.READY, new ArrayList<String>() {{
                add("France");
                add("Mexico");
            }}));
            put(LocalDateTime.of(1965, 7, 30, 5, 34), new Worker("Andrei", "ymstrhe", (byte) 52, Status.READY, new ArrayList<String>() {{
                add("USA");
                add("Monaco");
            }}));
            put(LocalDateTime.of(1969, 8, 21, 6, 23), new Worker("Mila", "awerghaen", (byte) 48, Status.READY, new ArrayList<String>() {{
                add("Singapore");
                add("London");
            }}));
            put(LocalDateTime.of(1971, 9, 20, 8, 43), new Worker("June", "aetnsrn", (byte) 46, Status.READY, new ArrayList<String>() {{
                add("Belgium");
                add("PAris");
                add("Monaco");
            }}));
            put(LocalDateTime.of(1981, 11, 19, 7, 12), new Worker("Alex", "awrehbstr", (byte) 35, Status.READY, new ArrayList<String>() {{
                add("Spain");
                add("Bangladesh");
            }}));
            put(LocalDateTime.of(1982, 12, 19, 7, 12), new Worker("Alex", "awrehbstr", (byte) 35, Status.READY, new ArrayList<String>() {{
                add("Brazil");
                add("Algir");
            }}));
            put(LocalDateTime.of(1983, 10, 19, 7, 12), new Worker("Alex", "awrehbstr", (byte) 35, Status.READY, new ArrayList<String>() {{
                add("India");
                add("Izrail");
            }}));
            put(LocalDateTime.of(1954, 3, 9, 2, 32), new Worker("Ion", "Valerejet5ryhovici", (byte) 63, Status.NOT_READY, new ArrayList<String>() {{
                add("Ireland");
                add("Iemen");
            }}));
            put(LocalDateTime.of(1965, 2, 8, 12, 43), new Worker("Vanea", "Valwethtrerovici", (byte) 52, Status.READY, new ArrayList<String>() {{
                add("Kamerun");
                add("Moldova");
            }}));
            put(LocalDateTime.of(1967, 1, 5, 23, 23), new Worker("Vika", "teuyjw4e", (byte) 50, Status.READY, new ArrayList<String>() {{
                add("Canada");
                add("China");
            }}));
            put(LocalDateTime.of(1996, 5, 20, 22, 12), new Worker("Kuzea", "qwergeryj", (byte) 21, Status.NOT_READY, new ArrayList<String>() {{
                add("Italy");
                add("London");
            }}));
            put(LocalDateTime.of(1960, 3, 4, 19, 14), new Worker("Dima", "tu,dnfgbs", (byte) 57, Status.NOT_READY, new ArrayList<String>() {{
                add("Kuveit");
                add("Cuba");
            }}));
            put(LocalDateTime.of(1979, 6, 6, 17, 15), new Worker("Tanya", "srtjfyum", (byte) 38, Status.READY, new ArrayList<String>() {{
                add("USA");
                add("Moldova");
                add("London");
            }}));
            put(LocalDateTime.of(1983, 8, 1, 15, 39), new Worker("Andreiq", "mdtunsae", (byte) 34, Status.READY, new ArrayList<String>() {{
                add("Latvia");
                add("Italy");
                add("Luxemburg");
            }}));
            put(LocalDateTime.of(1984, 5, 3, 17, 49), new Worker("Ksenia", "mr7y6etmstf", (byte) 33, Status.READY, new ArrayList<String>() {{
                add("Madagaskar");
                add("Mexico");
            }}));
            put(LocalDateTime.of(2000, 9, 2, 18, 47), new Worker("Anna", "m46ret5wjrht", (byte) 17, Status.NOT_READY, new ArrayList<String>() {{
                add("Monaco");
                add("Italy");
                add("London");
            }}));
            put(LocalDateTime.of(2001, 10, 4, 14, 11), new Worker("Misha", "sryjnt", (byte) 16, Status.NOT_READY, new ArrayList<String>() {{
                add("Niger");
                add("Nigeria");
            }}));

        }};
    }


    public void sortList(List<Map.Entry<LocalDateTime, Worker>> list) {
        Collections.sort(list, comparator);
    }

    public Set<Worker> workersReadyForTrip(Map<LocalDateTime, Worker> workerMap, LocalDateTime startDate, LocalDateTime endDate) {
        employeeSet = new LinkedHashSet<>();
        employeeSet.addAll(workerMap
                .keySet()
                .stream()
                .filter(mapIterator -> isReadyForTrip(mapIterator, startDate, endDate))
                .map(workerMap::get)
                .collect(Collectors.toList()));
        return employeeSet;
    }
    
    private boolean isReadyForTrip(LocalDateTime hireDate, LocalDateTime startDate, LocalDateTime endDate){
        return (hireDate.isBefore(endDate) && hireDate.isAfter(startDate));
    }

    public Capability possibilityToVisitCountry(Worker worker, List<String> countries) {
        for (String countryIterator : countries) {
            if(workerCanVisitCountry(countryIterator, worker.getAllowedCountries()))
                    return Capability.YES;
            else return Capability.NO;
        }
        return Capability.NO;
    }

    private static boolean workerCanVisitCountry(String country, List<String> allowedCountries){
        for (String iterator: allowedCountries)
            if(iterator.equalsIgnoreCase(country))
                return true;
            else return false;
        return false;
    }

    public Map<String, List<Worker>> createFinalCollectionToStoreCountryAndWorkers(String country, List<Map.Entry<LocalDateTime, Worker>> workers) {
        Map<String, List<Worker>> modifiableMap = new TreeMap<>(Collections.reverseOrder());
        List<Worker> allowedWorkers = new ArrayList<>();
        for(Map.Entry<LocalDateTime, Worker> mapIterator: workers){
            allowedWorkers.addAll(mapIterator
                    .getValue()
                    .getAllowedCountries()
                    .stream()
                    .filter(countryIterator -> countryIterator.equalsIgnoreCase(country))
                    .map(countryIterator -> mapIterator.getValue())
                    .collect(Collectors.toList()));
        }
        modifiableMap.put(country, allowedWorkers);

        return Collections.unmodifiableMap(modifiableMap);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeService{");
        sb.append("employeeSet=").append(employeeSet);
        sb.append('}');
        return sb.toString();
    }
}
