
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int[] numbers = new int[5];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;
        numbers[4] = 1;
        
        System.out.println("Which index should we access?");
        int index = Integer.valueOf(reader.nextLine());
        
        int number = numbers[index];
        System.out.println(number);
    }

}
