package com.endava.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * Created by sbogdanschi on 27/03/2017.
 */
public class Employee {
    private LocalDateTime localDateTime;
    private Worker worker;

    public Employee() {
        //empty constructor
    }

    public Employee(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
        this.worker = new Worker();
    }

    public Employee(LocalDateTime localDateTime, Worker worker) {
        this.localDateTime = localDateTime;
        this.worker = worker;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(worker, employee.worker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localDateTime, worker);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("localDateTime=").append(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        sb.append(", worker=").append(worker);
        sb.append('}').append("\n");
        return sb.toString();
    }
}
