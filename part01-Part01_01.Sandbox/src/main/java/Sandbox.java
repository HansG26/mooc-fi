
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // Creating the scanner
        Scanner reader = new Scanner(System.in);
        
        while (true) {
            System.out.println("Insert positive integers");
            int number = Integer.valueOf(reader.nextLine());
            
            if(number == 0) {
                break;
            }
            
            if (number <= 0) {
                System.out.println("Unfit number! Try again.");
                continue;
            }
            
            System.out.println("Your input was " + number);
        }
    }
}
