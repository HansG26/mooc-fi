
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        
        ArrayList<Person> people = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(Paths.get("records.txt"))) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                
                people.add(new Person(name, age));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        
}
