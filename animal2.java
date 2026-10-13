interface Animal2 {
    default void sleep() {
        System.out.println("Animal is sleeping");
    }


class Dog implements Animal2 {
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sleep();
    }
}
}