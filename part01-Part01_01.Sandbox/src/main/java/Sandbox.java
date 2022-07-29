
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // Creating the scanner
        Scanner reader = new Scanner(System.in);
        
        int number = 1;
        
        while (true) {
            System.out.println("Exit? (y exits)");
            if(reader.nextLine().equals("y")) {
                break;
            }
        }
        
        System.out.println("Ready!");
    }
}
