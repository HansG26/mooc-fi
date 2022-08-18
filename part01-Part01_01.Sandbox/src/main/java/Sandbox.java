
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter two words, each on its own line.");
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        
        if (first.equals(second)) {
            System.out.println("The words were the same.");
        } else {
            System.out.println("The words were not the same.");
        }
    }

}
