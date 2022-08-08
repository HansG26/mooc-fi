
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int numberOfInputs = 0;
        
        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            sum = sum + Integer.valueOf(parts[1]);
            numberOfInputs++;
            
        }
        
        
        System.out.println("Sum of the ages is " + sum);
    }
        
}
