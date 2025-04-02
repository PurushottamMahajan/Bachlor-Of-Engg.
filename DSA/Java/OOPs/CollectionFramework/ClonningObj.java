package OOPs;

import java.util.Arrays;

public class ClonningObj {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person john = new Person(28, "John Doe");
        Person cloneJohn = (Person) john.clone();
        System.out.println(cloneJohn.age + " " + cloneJohn.name);
        System.out.println(Arrays.toString(cloneJohn.scores));

        cloneJohn.scores[0] = 90;

        System.out.println(Arrays.toString(cloneJohn.scores));
        System.out.println(Arrays.toString(john.scores));
    }
}

class Person implements Cloneable {
    int age;
    String name;
    int[] scores;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        this.scores = new int[]{80, 85, 90};
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.scores = this.scores.clone();
        return cloned;
    }
}
