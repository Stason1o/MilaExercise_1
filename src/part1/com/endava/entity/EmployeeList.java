package part1.com.endava.entity;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

/**
 * Created by sbogdanschi on 27/03/2017.
 */
public class EmployeeList {
    private Map<LocalDateTime, Worker> workerMap;
    //private List<Employee> employees;

    public EmployeeList() {
        //empty constructor
    }

    public EmployeeList(Map<LocalDateTime, Worker> workerMap) {
        this.workerMap = workerMap;
    }

    public Map<LocalDateTime, Worker> getWorkerMap() {
        return workerMap;
    }

    public void setWorkerMap(Map<LocalDateTime, Worker> workerMap) {
        this.workerMap = workerMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeList)) return false;
        EmployeeList that = (EmployeeList) o;
        return Objects.equals(workerMap, that.workerMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerMap);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeList{");
        sb.append("workerMap=").append(workerMap);
        sb.append('}').append('\n');
        return sb.toString();
    }
}
