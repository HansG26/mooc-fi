
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            int numberInput = Integer.valueOf(input);
            int cube = (int) Math.pow(numberInput, 3);
            System.out.println(cube);
        }
    }
}
