package OOPs;

// Main class to demonstrate access specifiers
public class AccessSpecifiers {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
    }
}

// Class with different access specifiers
class Test {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    public void publicMethod() {
        System.out.println("Public Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }
}

