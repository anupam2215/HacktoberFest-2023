import java.io.*;
import java.util.Scanner;

public class FileIOExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, Java File I/O!");
            writer.close();

            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
