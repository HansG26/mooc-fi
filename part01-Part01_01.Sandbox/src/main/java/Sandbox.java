
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        
        listElements(numbers);
    }
        
    public static void listElements(int[] integerArray) {
        System.out.println("The elements of the array are: ");
        int index = 0;
        while(index < integerArray.length) {
            int number = integerArray[index];
            System.out.print(number + " ");
            index++;
        }
        
        System.out.println(" ");
    }    

}
