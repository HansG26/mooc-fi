
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        try (Scanner scanner = new Scanner(Paths.get("file.txt"))) {
            
            while(scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
        
}
