package part1.com.endava.service;

import part1.com.endava.entity.Worker;
import part1.com.endava.entity.enums.Capability;

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
