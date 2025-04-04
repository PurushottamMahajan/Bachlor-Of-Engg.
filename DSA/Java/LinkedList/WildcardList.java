package OOPs.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Here T should either be Number or its subclasses
public class WildcardList<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // works as the index value

    public WildcardList() {
        data = new Object[DEFAULT_SIZE];
    }

    // Method to demonstrate the use of wildcard with upper bound
    public void getList(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println("Element: " + num);
        }
    }

    // Method to add an element to the list
    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    // Method to resize the array when it becomes full
    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    // Check if the array is full
    private boolean isFull() {
        return size == data.length;
    }

    // Remove and return the last element
    public T remove() {
        T removed = (T) data[--size];
        return removed;
    }

    // Get element at a specific index
    public T get(int index) {
        return (T) data[index];
    }

    // Get the size of the list
    public int size() {
        return size;
    }

    // Set the value at a specific index
    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildcardList<Integer> list3 = new WildcardList<>();
        
        // Adding elements to the list
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }

        // Printing the list after adding elements
        System.out.println(list3);

        // Using getList method with ArrayList
        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(3.5);
        list2.add(7.8);
        list2.add(1.2);

        list3.getList(list2); // Passing a Double list to the getList method
    }
}
