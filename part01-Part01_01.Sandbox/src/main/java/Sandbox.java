import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // Creating the scanner
        Scanner reader = new Scanner(System.in);
        
        int first = Integer.valueOf(reader.nextLine());
        int second = Integer.valueOf(reader.nextLine());
        
        int sum = first + second;
        
        if (sum > 100) {
            System.out.println("too much");
        } else if (sum < 0) {
            System.out.println("too little");
        } else {
            System.out.println("ok");
        }
    }
}
