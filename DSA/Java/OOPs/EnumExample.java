package OOPs;

// Enum declared outside the class with constants and additional fields
enum Day {
    MONDAY("Weekday"), TUESDAY("Weekday"), WEDNESDAY("Weekday"),
    THURSDAY("Weekday"), FRIDAY("Weekday"),
    SATURDAY("Weekend"), SUNDAY("Weekend");

    private String type;

    Day(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Enum implementing an interface
interface AnimalSound {
    void makeSound();
}

enum Animal implements AnimalSound {
    DOG {
        @Override
        public void makeSound() {
            System.out.println("Dog barks.");
        }
    },
    CAT {
        @Override
        public void makeSound() {
            System.out.println("Cat meows.");
        }
    },
    COW {
        @Override
        public void makeSound() {
            System.out.println("Cow moos.");
        }
    }
}

// Main class
public class EnumExample {
    public static void main(String[] args) {
        System.out.println("=== Accessing Enum Constants and Their Fields ===");
        for (Day day : Day.values()) {
            System.out.println(day + " is a " + day.getType());
        }

        System.out.println("\n=== Enum with Interface Implementation ===");
        Animal animal1 = Animal.DOG;
        Animal animal2 = Animal.CAT;
        animal1.makeSound();
        animal2.makeSound();

        System.out.println("\n=== Using ordinal(), valueOf(), and toString() ===");
        System.out.println("Ordinal of TUESDAY: " + Day.TUESDAY.ordinal());
        Day d = Day.valueOf("FRIDAY");
        System.out.println("Day obtained from valueOf: " + d);

        System.out.println("\n=== Comparing Enum Constants ===");
        System.out.println("MONDAY == FRIDAY: " + (Day.MONDAY == Day.FRIDAY));
        System.out.println("MONDAY equals MONDAY: " + Day.MONDAY.equals(Day.MONDAY));

        System.out.println("\n=== Enum Constructor Execution and Field Usage ===");
        Day saturday = Day.SATURDAY;
        System.out.println("Day: " + saturday + ", Type: " + saturday.getType());

        System.out.println("\n=== Enum toString() Demonstration ===");
        System.out.println("String representation of SUNDAY: " + Day.SUNDAY.toString());
    }
}
