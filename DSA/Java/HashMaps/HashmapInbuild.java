package HashMaps;

import java.util.HashMap;

public class HashmapInbuild {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // Accessing values
        System.out.println("Value for Apple: " + map.get("Apple"));

        // Iterating through the map
        for (String key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }
    }
}

