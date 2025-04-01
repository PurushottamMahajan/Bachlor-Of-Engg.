package OOPs.CollectionFramework;
import java.util.Arrays;

public class CustomGenericList<T> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T item) {
        if (isFull()) {
            resize();
        }
        data[size++] = item;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("List is empty!");
        }
        T removed = (T) data[--size];
        data[size] = null; // avoid memory leak
        return removed;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenericList{" +
                "data=" + Arrays.toString(Arrays.copyOf(data, size)) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenericList<String> strList = new CustomGenericList<>();
        strList.add("Java");
        strList.add("Python");
        strList.add("C++");

        System.out.println(strList);
        System.out.println("Removed: " + strList.remove());
        System.out.println("After Removal: " + strList);

        strList.set(1, "JavaScript");
        System.out.println("After Update: " + strList);

        System.out.println("Element at index 0: " + strList.get(0));

        CustomGenericList<Integer> intList = new CustomGenericList<>();
        for (int i = 0; i < 12; i++) {
            intList.add(i * 3);
        }
        System.out.println(intList);
        System.out.println("Removed: " + intList.remove());
        System.out.println("After Removal: " + intList);
    }
}
