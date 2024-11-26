package java8feature;
@FunctionalInterface
interface MyInterface {
    void add();
}

class MyClass implements MyInterface {
    @Override
    public void add() {
        System.out.println("Add method from MyClass");
    }
}

public class MainApp {
    public static void main(String args[]) {
        // Creating an instance of MyClass
        MyClass obj = new MyClass();
        obj.add();

        // Anonymous class implementation
        MyInterface obj1 = new MyInterface() {
            @Override
            public void add() {
                System.out.println("Add method from Anonymous Class");
            }
        };
        obj1.add();

        // Using Lambda Expression
        MyInterface obj2 = () -> {
            System.out.println("Add method from Lambda Expression");
        };
        obj2.add();
    }
}

