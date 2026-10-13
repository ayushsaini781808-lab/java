public class counter {
    int count = 0;
   synchronized void increment() {
        count++;
    }
    public class Main {
        public static void main(String[] args) {
            counter c = new counter();
            new Thread(() -> { for (int i = 0; i < 100000; i++) c.increment(); }).start();

          new Thread(() -> { for (int i = 0; i < 100000; i++) c.increment(); }).start();
           
            System.out.println(c.count);
    }
    
}
}


// class counter {
//     int count =0;
//     void increament(){
//         synchronized(this) {
//             count++;
//         }
//     }
// }