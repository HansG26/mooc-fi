
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a number between 1 and 100");
        
        int number = Integer.valueOf(scan.nextLine());
        
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
        
    }
}
