
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numbersInputted = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            sum = sum + number;
            numbersInputted = numbersInputted + 1;
        }
        
        System.out.println("Number of numbers: " + numbersInputted);
        System.out.println("Sum of the numbers: " + sum);

    }
}
