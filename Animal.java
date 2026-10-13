// interface Animal {
//     void makesound();


// class Dog implements Animal {
//     public void makesound() {
//         System.out.println("Dog barks");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.makesound();
//     }
// }
// }


class Animal {
    
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
 class puppy extends Dog {
    void sound() {
        System.out.println("Puppy yelps");
    }
}
      class Main {
    public static void main(String[] args) {
        puppy p = new puppy();
        p.sound();
    }
}
