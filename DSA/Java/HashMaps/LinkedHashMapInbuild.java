package HashMaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapInbuild {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();

        // Add entries
        linkedMap.put(101, "Apple");
        linkedMap.put(102, "Banana");
        linkedMap.put(103, "Cherry");
        linkedMap.put(104, "Date");

        // Print the map (in insertion order)
        for (Map.Entry<Integer, String> entry : linkedMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
