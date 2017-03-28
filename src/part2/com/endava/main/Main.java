package part2.com.endava.main;


import part2.com.endava.entities.User;
import part2.com.endava.util.SimpleLRU;

import java.time.LocalDateTime;

/**
 * Created by sbogdanschi on 28/03/2017.
 */
public class Main {
    public static void main(String... args) {
        SimpleLRU<LocalDateTime, User> simpleLRU = new SimpleLRU<>(5);

        simpleLRU.put(LocalDateTime.now(), new User("Stas", "Stas", 21));
        simpleLRU.put(LocalDateTime.of(2017, 12, 13, 12, 56), new User("qwer", "eqrfvwer", 12));
        simpleLRU.put(LocalDateTime.of(2000, 12, 13, 12, 10), new User("jhrfgv", "sfhmgv", 43));
        simpleLRU.put(LocalDateTime.now(), new User("jyrnhbtgfv", "wefwr", 14));
        simpleLRU.put(LocalDateTime.of(2004, 10, 14, 23, 54), new User("etrgvwer", "trgv2er", 23));

        simpleLRU.put(LocalDateTime.now(), new User("new UIser", "q3rwefe", 11));

        System.out.println(simpleLRU);
    }
}
