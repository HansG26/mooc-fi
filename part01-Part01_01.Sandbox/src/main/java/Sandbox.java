
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        
    }

    public static double average(ArrayList<Integer> numbers) {
        if(numbers.size() == 0) {
            return -1.0;
        }
        
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        
        return (double) sum / (double) numbers.size();
    }

}
