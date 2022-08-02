
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        multiplicationTable(3);
    }
    
    public static void printMultiplicationTableRow(int number, int coefficient) {
        int printable = number;
        
        while(printable <= number * coefficient) {
            System.out.print(" " + printable);
            printable += number;
        }
        
        System.out.println("");
    }
    
    public static void multiplicationTable(int max) {
        int number = 1;
        
        while (number <= max) {
            printMultiplicationTableRow(number, max);
            number++;
        }
    }
    
    
}
