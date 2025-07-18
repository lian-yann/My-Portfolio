class Animal {
    String name;

    void eat() {
        System.out.println("si " + name + " ay lumalamon..");
    }
    void sleep() {
        System.out.println("si " + name + " ay natutulog");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("si " + name + " ay umaalulong");
    }
}

public class Main {
    public static void
    main(String[] args) {
    Dog bantay = new Dog();

    bantay.name = "bogart";

    bantay.eat();
    bantay.sleep();
    bantay.bark();
    }
}