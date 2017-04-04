package part1.com.endava.entity;

import part1.com.endava.entity.enums.Country;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by sbogdanschi on 27/03/2017.
 */
public class EmployeeList {
    private static Map<LocalDateTime, Worker> workerMap;

    static {
       workerMap = new LinkedHashMap<LocalDateTime, Worker>() {{
            put(LocalDateTime.of(1960, 3, 13, 11, 5),
                    new Worker("Valera", "Valerovici", (byte) 57, true, new ArrayList<Country>() {{
                        add(Country.USA);
                        add(Country.MOLDOVA);
                    }}));
            put(LocalDateTime.of(1970, 4, 12, 12, 0), new Worker("Petea", "ethbnrb", (byte) 47, true, new ArrayList<Country>() {{
                add(Country.USA);
                add(Country.LONDON);
            }}));
            put(LocalDateTime.of(1980, 5, 16, 14, 50), new Worker("Vasea", "rstjnsrn", (byte) 37, false, new ArrayList<Country>() {{
                add(Country.MOLDOVA);
                add(Country.PARIS);
                add(Country.MONACO);
            }}));
            put(LocalDateTime.of(1990, 6, 13, 10, 43), new Worker("Anton", "eahbstrn", (byte) 27, true, new ArrayList<Country>() {{
                add(Country.FRANCE);
                add(Country.MEXICO);
            }}));
            put(LocalDateTime.of(1965, 7, 30, 5, 34), new Worker("Andrei", "ymstrhe", (byte) 52, true, new ArrayList<Country>() {{
                add(Country.USA);
                add(Country.MONACO);
            }}));
            put(LocalDateTime.of(1969, 8, 21, 6, 23), new Worker("Mila", "awerghaen", (byte) 48, true, new ArrayList<Country>() {{
                add(Country.SINGAPORE);
                add(Country.LONDON);
            }}));
            put(LocalDateTime.of(1971, 9, 20, 8, 43), new Worker("June", "aetnsrn", (byte) 46, true, new ArrayList<Country>() {{
                add(Country.BELGIUM);
                add(Country.PARIS);
                add(Country.MONACO);
            }}));
            put(LocalDateTime.of(1981, 11, 19, 7, 12), new Worker("Alex", "awrehbstr", (byte) 35, true, new ArrayList<Country>() {{
                add(Country.SPAIN);
                add(Country.BANGLADESH);
            }}));
            put(LocalDateTime.of(1982, 12, 19, 7, 12), new Worker("Alex", "awrehbstr", (byte) 35, true, new ArrayList<Country>() {{
                add(Country.BRAZIL);
                add(Country.ALGIR);
            }}));
            put(LocalDateTime.of(1983, 10, 19, 7, 12), new Worker("Alex", "awrehbstr", (byte) 35, true, new ArrayList<Country>() {{
                add(Country.INDIA);
                add(Country.IZRAEL);
            }}));
            put(LocalDateTime.of(1954, 3, 9, 2, 32), new Worker("Ion", "Valerejet5ryhovici", (byte) 63, false, new ArrayList<Country>() {{
                add(Country.IRELAND);
                add(Country.IEMEN);
            }}));
            put(LocalDateTime.of(1965, 2, 8, 12, 43), new Worker("Vanea", "Valwethtrerovici", (byte) 52, true, new ArrayList<Country>() {{
                add(Country.KAMERUN);
                add(Country.MOLDOVA);
            }}));
            put(LocalDateTime.of(1967, 1, 5, 23, 23), new Worker("Vika", "teuyjw4e", (byte) 50, true, new ArrayList<Country>() {{
                add(Country.CANADA);
                add(Country.CHINA);
            }}));
            put(LocalDateTime.of(1996, 5, 20, 22, 12), new Worker("Kuzea", "qwergeryj", (byte) 21, false, new ArrayList<Country>() {{
                add(Country.ITALY);
                add(Country.LONDON);
            }}));
            put(LocalDateTime.of(1960, 3, 4, 19, 14), new Worker("Dima", "tu,dnfgbs", (byte) 57, false, new ArrayList<Country>() {{
                add(Country.KUVEIT);
                add(Country.CUBA);
            }}));
            put(LocalDateTime.of(1979, 6, 6, 17, 15), new Worker("Tanya", "srtjfyum", (byte) 38, true, new ArrayList<Country>() {{
                add(Country.USA);
                add(Country.MOLDOVA);
                add(Country.LONDON);
            }}));
            put(LocalDateTime.of(1983, 8, 1, 15, 39), new Worker("Andreiq", "mdtunsae", (byte) 34, true, new ArrayList<Country>() {{
                add(Country.LATVIA);
                add(Country.ITALY);
                add(Country.LUXEMBURG);
            }}));
            put(LocalDateTime.of(1984, 5, 3, 17, 49), new Worker("Ksenia", "mr7y6etmstf", (byte) 33, true, new ArrayList<Country>() {{
                add(Country.MADAGASKAR);
                add(Country.MEXICO);
            }}));
            put(LocalDateTime.of(2000, 9, 2, 18, 47), new Worker("Anna", "m46ret5wjrht", (byte) 17, false, new ArrayList<Country>() {{
                add(Country.MONACO);
                add(Country.ITALY);
                add(Country.LONDON);
            }}));
            put(LocalDateTime.of(2001, 10, 4, 14, 11), new Worker("Misha", "sryjnt", (byte) 16, false, new ArrayList<Country>() {{
                add(Country.NIGER);
                add(Country.NIGERIA);
            }}));

        }};
    }

    public Map<LocalDateTime, Worker> getWorkerMap() {
        return workerMap;
    }

    public void setWorkerMap(Map<LocalDateTime, Worker> workerMap) {
        this.workerMap = workerMap;
    }

}
