package OOPs;

import java.util.Arrays;

class Student implements Comparable<Student> {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Overriding compareTo() method to compare students by age
    @Override
    public int compareTo(Student other) {
        if (this.age == other.age) {
            return this.name.compareTo(other.name); // Compare by name if age is the same
        }
        return Integer.compare(this.age, other.age); // Compare by age
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

// Main class renamed to ObjectComparision
public class ObjectComparision {
    public static void main(String[] args) {
        Student s1 = new Student("Kunal", 25);
        Student s2 = new Student("Rahul", 22);
        Student s3 = new Student("Aman", 25);

        // Comparing two students
        System.out.println("Comparing s1 and s2: " + s1.compareTo(s2)); // Positive value (s1 > s2)
        System.out.println("Comparing s2 and s1: " + s2.compareTo(s1)); // Negative value (s2 < s1)
        System.out.println("Comparing s1 and s3: " + s1.compareTo(s3)); // Compare by name if age is equal

        // Array of students
        Student[] students = {s1, s2, s3};

        // Sorting the array using compareTo()
        Arrays.sort(students);

        // Displaying sorted students
        System.out.println("After sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
