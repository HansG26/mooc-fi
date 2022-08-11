
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();
        
        while (true) {
            System.out.println("Enter the details, empty will stop: ");
            String details = scanner.nextLine();
            if (details.isEmpty()) {
                break;
            }
            
            String[] parts = details.split(",");
            
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            
            persons.add(new Person(name, age));
        }
        
        System.out.println("");
        System.out.println("Persons in total: " + persons.size());
        System.out.println("Persons: ");
        
        System.out.println("What is the age limit?");
        int ageLimit = Integer.valueOf(scanner.nextLine());
        
        for(Person person : persons) {
            if(person.getAge() >= ageLimit) {
                System.out.println(person);
            }
        }
    }
        
}
