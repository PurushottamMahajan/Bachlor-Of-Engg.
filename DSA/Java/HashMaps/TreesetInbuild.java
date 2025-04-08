package HashMaps;

import java.util.TreeSet;

public class TreesetInbuild {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");

        // Sorted set - automatically in natural (ascending) order
        for (String item : treeSet) {
            System.out.println(item);
        }
    }
}
