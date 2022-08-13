
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(Paths.get("records.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        while (true) {
            System.out.println("Enter name and age seperated by a comma: ");
            String line = scanner.nextLine();
            
            if (line.equals("")) {
                break;
            }
            
            String[] parts = line.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

    }
        
}
