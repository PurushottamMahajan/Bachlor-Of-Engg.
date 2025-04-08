package HashMaps;

import java.util.HashSet;

public class HashsetInbuil {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // duplicate - will be ignored

        // Iterating over the set
        for (String item : set) {
            System.out.println(item);
        }
    }
}
