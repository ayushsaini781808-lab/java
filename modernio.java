import java.io.*;
 public class modernio{
    public static void main(String[] args) {


try (FileWriter fw = new FileWriter("data.txt"))
{    fw.write("automatic resource closing.");
    fw.close();

}
catch (IOException e) {
    e.printStackTrace();
}
 }
}