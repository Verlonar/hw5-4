import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String s = "Hello";
        try {
            File file = new File("C:\\Program Files\\text.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(s);
        } catch (IOException e) {
            System.out.println("Такого файла нет");
        }
    }
}