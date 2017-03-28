package part2.com.endava.util;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by sbogdanschi on 28/03/2017.
 */
public class SimpleLRU<K, V> extends LinkedHashMap<K, V> {
    private final int maxEntries;

    public SimpleLRU(final int maxEntries){
        super(maxEntries + 1, 1.0f, true);
        this.maxEntries = maxEntries;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return super.size() > maxEntries;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SimpleLRU{");
        sb.append("maxEntries=").append(maxEntries).append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
