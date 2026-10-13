// import java.io.*;
// public class writebytefile {
//     public static void main(String[] args) throws Exception{
//         FileOutputStream fos=new FileOutputStream("data.txt");
//         fos.write(65);
//         fos.close();
//          System.out.println("data.txt file created and byte written successfully.");
//     }
       
// }
    
//2 writing text file 

import java.io.*;
public class writebytefile {
  public static void main(String[] args) throws Exception {
    FileWriter fw = new FileWriter("data.txt");
    fw.write("Hello, this is a text file.");
    fw.close();
    System.out.println("data.txt file created and text written successfully.");
}
}

