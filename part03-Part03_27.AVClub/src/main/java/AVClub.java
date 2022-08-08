
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                break;
            }
            
            String[] splittedInput = input.split(" ");
            
            for (int i = 0; i < splittedInput.length; i++) {
                if (splittedInput[i].contains("av")) {
                    System.out.println(splittedInput[i]);
                }
            }
        }
    }
}
