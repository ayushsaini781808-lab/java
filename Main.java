// class parent  {
//     String name = "Ayush saini";
// }
//  class child extends parent {
//    String name = "student";
//    void showNames(){
//     System.out.println("Name in child class: " + name);
//     System.out.println("Name in parent class: " + super.name);
//    }
//  }

// public class Main {
//     public static void main(String[] args) {
//         child obj = new child();
//         obj.showNames();
//     }
// }



public class Main {
    public static void main(String[] args) {
        try {
            int data = 100 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("exception caught: " + e);

        }
        finally {
            System.out.println("This block is always executed");
        }
    }
}