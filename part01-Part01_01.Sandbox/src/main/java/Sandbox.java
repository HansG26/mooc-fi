
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        printSmallerThan(list, 3);
    }

    public static void printSmallerThan(ArrayList<Integer> numbers, int threshold) {
        for (int number : numbers) {
            if (number < threshold) {
                System.out.println(number);
            }
        }
    }

}
