package OOPs;


interface GenericInterface<T> {
    void display(T value);
}


class IntegerDisplay implements GenericInterface<Integer> {
    @Override
    public void display(Integer value) {
        System.out.println("Displaying Integer value: " + value);
    }
}

class StringDisplay implements GenericInterface<String> {
    @Override
    public void display(String value) {
        System.out.println("Displaying String value: " + value);
    }
}

public class GenericInterfaceTest {

    public static void main(String[] args) {

        GenericInterface<Integer> intDisplay = new IntegerDisplay();
        intDisplay.display(42);


        GenericInterface<String> strDisplay = new StringDisplay();
        strDisplay.display("Hello Generics!");


        GenericInterface<Double> doubleDisplay = new GenericInterface<Double>() {
            @Override
            public void display(Double value) {
                System.out.println("Displaying Double value: " + value);
            }
        };
        doubleDisplay.display(3.14);
    }
}