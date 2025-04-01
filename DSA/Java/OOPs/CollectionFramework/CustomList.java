package OOPs.CollectionFramework;

import java.util.Arrays;

public class CustomList {

    private String[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // tracks the number of elements

    public CustomList() {
        this.data = new String[DEFAULT_SIZE];
    }

    public void add(String item) {
        if (isFull()) {
            resize();
        }
        data[size++] = item;
    }

    private void resize() {
        String[] temp = new String[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public String remove() {
        String removed = data[--size];
        data[size] = null; // optional: avoid memory leak
        return removed;
    }

    public String get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, String value) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomList{" +
                "data=" + Arrays.toString(Arrays.copyOf(data, size)) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomList list = new CustomList();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        for (int i = 4; i <= 12; i++) {
            list.add("Item " + i);
        }

        System.out.println(list);
        System.out.println("Removed: " + list.remove());
        System.out.println("After Removal: " + list);
        System.out.println("Element at index 2: " + list.get(2));

        list.set(1, "JavaScript");
        System.out.println("After Update: " + list);
    }
}