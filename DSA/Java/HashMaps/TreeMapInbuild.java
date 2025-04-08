package HashMaps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapInbuild {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add entries (unsorted)
        treeMap.put("Banana", 20);
        treeMap.put("Apple", 10);
        treeMap.put("Mango", 30);
        treeMap.put("Cherry", 15);

        // Print entries (will be sorted by key)
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
