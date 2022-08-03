
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        
        System.out.println("Search for?");
        int searchNumber = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> searchNumbers = new ArrayList<>();
        
        for (int i = 0; i < list.size(); i++) {
            
            int currentNumber = list.get(i);
            
            if(currentNumber == searchNumber) {
                searchNumbers.add(i);
            }
        }
        
        for (int i = 0; i < searchNumbers.size(); i++) {
            System.out.println(searchNumber + " is at index " + searchNumbers.get(i));
        }
        
    }
}
