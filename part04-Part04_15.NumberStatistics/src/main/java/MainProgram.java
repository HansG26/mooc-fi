
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics evenNumbers = new Statistics();
        Statistics unevenNumbers = new Statistics();
        Statistics allNumbers = new Statistics();
        
        System.out.println("Enter numbers:");
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == -1) {
                break;
            }
            
            if (input % 2 == 0) {
                evenNumbers.addNumber(input);
            } else {
                unevenNumbers.addNumber(input);
            }
            
            allNumbers.addNumber(input);
        }
        
        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of uneven numbers: " + unevenNumbers.sum());
    }
}
