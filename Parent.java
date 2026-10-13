public class Parent {
    Parent get() {
        return this;
    }
    
}
class Child extends Parent {
    @Override
    Child get() {
        return this;
    }
    
    void message() {
        System.out.println("This is child class");
    }
}
