
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the second number: ");
        int second = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The combined sum of the numbers is: " + sum(first, second));

    }

    public static int sum(int first, int second) {
        return first + second;
    }

}
