package OOPs;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        Consumer<Integer> action = (n) -> System.out.println(n * 3);
        list.forEach(action);

        MathOperation add = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation subtract = (a, b) -> a - b;

        LambdaFunDemo calc = new LambdaFunDemo();
        System.out.println(calc.execute(8, 4, add));
        System.out.println(calc.execute(8, 4, multiply));
        System.out.println(calc.execute(8, 4, subtract));
    }

    private int execute(int a, int b, MathOperation op) {
        return op.apply(a, b);
    }
}

interface MathOperation {
    int apply(int a, int b);
}
