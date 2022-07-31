
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int end = Integer.valueOf(scanner.nextLine());
        
        for (int i = 1; i <= end; i++) {
            System.out.println(i);
        }
    }
}
