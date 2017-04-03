package part1.com.endava.util;

import part1.com.endava.entity.Worker;
import part1.com.endava.entity.enums.Status;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by sbogdanschi on 28/03/2017.
 */
public class EmployeeInit {

    public static Map<LocalDateTime, Worker> createEmployees() {
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
}
