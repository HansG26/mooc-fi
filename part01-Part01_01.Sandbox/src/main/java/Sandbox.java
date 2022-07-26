
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int number = Integer.valueOf(reader.nextLine());
        
        if (number % 400 == 0) {
            System.out.println("The number " + number + " is divisible by four hundred.");
        } else {
            System.out.println("The number " + number + " is not divisible by four hundred.");
        }
    }
}
