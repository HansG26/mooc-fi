
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int amountOfNumbers = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            sum = sum + number;
            amountOfNumbers = amountOfNumbers + 1;
        }
        
        double average = (double) sum / (double) amountOfNumbers;
        System.out.println("Average of the numbers: " + average);
    }
}
