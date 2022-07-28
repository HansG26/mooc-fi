import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // Creating the scanner
        Scanner reader = new Scanner(System.in);
        
        int first = 1;
        int second = 2;
        
        first = Integer.valueOf(reader.nextLine());
        second = Integer.valueOf(reader.nextLine());
        
        int product = first * second;
        
         System.out.println("The product of " + first + " and " + second + " is " + product);
    }
}
