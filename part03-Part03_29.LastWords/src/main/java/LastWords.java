
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(" ");
            
            System.out.println(pieces[pieces.length - 1]);
            
        }
    }
}
