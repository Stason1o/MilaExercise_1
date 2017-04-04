package part1.com.endava.entity;

import part1.com.endava.entity.enums.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by sbogdanschi on 27/03/2017.
 */
public class Worker {
    private String firstName;
    private String lastName;
    private byte age;
    private boolean readyForTrip;

    private List<Country> allowedCountries;

    public Worker() {
        //empty constructor
    }

    public Worker(String firstName, String lastName, byte age, boolean status, ArrayList<Country> allowedCountries) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.readyForTrip = status;
        this.allowedCountries = allowedCountries;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public boolean getReadyForTrip() {
        return readyForTrip;
    }

    public void setReadyForTrip(boolean readyForTrip) {
        this.readyForTrip = readyForTrip;
    }

    public List<Country> getAllowedCountries() {
        return allowedCountries;
    }

    public void setAllowedCountries(List<Country> allowedCountries) {
        this.allowedCountries = allowedCountries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age &&
                Objects.equals(firstName, worker.firstName) &&
                Objects.equals(lastName, worker.lastName) &&
                readyForTrip == worker.readyForTrip;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, readyForTrip);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Worker{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append(", readyForTrip=").append(readyForTrip);
        sb.append(", allowedCountries=").append(allowedCountries);
        sb.append('}');
        return sb.toString();
    }
}
