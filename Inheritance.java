
class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int roll;

    Student(String name, int age, int roll){
        super(name, age);
        this.roll = roll;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll: " + roll);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student s = new Student("Ayush Saini", 20, 350);
        s.display();
    }
}