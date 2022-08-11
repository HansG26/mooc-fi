
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();
        
        while (true) {
            System.out.println("Enter a name, empty will stop: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            persons.add(new Person(name));
        }
        
        System.out.println("");
        System.out.println("Persons in total: " + persons.size());
        System.out.println("Persons: ");
        
        for(Person person : persons) {
            System.out.println(person);
        }
    }
        
}
