package OOPs.CollectionFramework;

import java.util.*;

public class CollectionOperations {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println("ArrayList: " + arrayList);
        arrayList.remove(1);
        System.out.println("After Removing Element: " + arrayList);
        System.out.println("Element at index 1: " + arrayList.get(1));

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");
        System.out.println("LinkedList: " + linkedList);
        linkedList.addFirst("HTML");
        linkedList.addLast("JavaScript");
        System.out.println("After Adding First & Last: " + linkedList);
        linkedList.remove("Python");
        System.out.println("After Removing Element: " + linkedList);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Mango");
        System.out.println("HashSet: " + hashSet);
        hashSet.remove("Banana");
        System.out.println("After Removing Element: " + hashSet);

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("HashMap: " + hashMap);
        hashMap.remove(2);
        System.out.println("After Removing Key 2: " + hashMap);
        System.out.println("Value for Key 1: " + hashMap.get(1));
    }
}
