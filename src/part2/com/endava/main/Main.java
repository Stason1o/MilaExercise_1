package part2.com.endava.main;


import part2.com.endava.util.SimpleLRU;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sbogdanschi on 28/03/2017.
 */
public class Main {
    public static void main(String... args) {
        SimpleLRU<String, LocalDateTime> simpleLRU = new SimpleLRU<>(50);
        List<String> nameList = new ArrayList<>();
        for(int i = 0; i < 100; i++)
            nameList.add("User" + i);

        for(int i = 0; i < 3000; i++)
            simpleLRU.put(nameList.get((int) (Math.random() * 100) ), LocalDateTime.now());

        simpleLRU.entrySet().forEach( item-> System.out.println(item.getKey() + " " + item.getValue()));
    }
}
