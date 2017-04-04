package part1.com.endava.service;

import part1.com.endava.entity.Worker;
import part1.com.endava.entity.enums.Country;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by sbogdanschi on 27/03/2017.
 */
public class EmployeeService {

    private Set<Worker> employeeSet;
    //private static Comparator<Map<LocalDateTime, Worker>> comparator = Comparator.comparing();

    public EmployeeService() {
        //empty constructor
    }

    public Map<LocalDateTime, Worker> sortList(Map<LocalDateTime, Worker> workerMap) {
        Map<LocalDateTime, Worker> result = new LinkedHashMap<>();
        workerMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(value -> result.put(value.getKey(), value.getValue()));
        return result;
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

    public boolean possibilityToVisitCountry(Worker worker, List<Country> countries) {
        for (Country countryIterator : countries) {
            if(workerCanVisitCountry(countryIterator, worker.getAllowedCountries()))
                return true;
        }
        return false;
    }

    private static boolean workerCanVisitCountry(Country givenCountry, List<Country> allowedCountries){
        for (Country country: allowedCountries) {
            if (country == givenCountry)
                return true;
        }
        return false;
    }

    public Map<Country, List<Worker>> createFinalCollectionToStoreCountryAndWorkers(Country country, Map<LocalDateTime, Worker> workers) {
        Map<Country, List<Worker>> modifiableMap = new TreeMap<>(Collections.reverseOrder());
        List<Worker> allowedWorkers = new ArrayList<>();
        for(Map.Entry<LocalDateTime, Worker> mapIterator: workers.entrySet()){
            allowedWorkers.addAll(mapIterator
                    .getValue()
                    .getAllowedCountries()
                    .stream()
                    .filter(countryIterator -> countryIterator == country)
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
