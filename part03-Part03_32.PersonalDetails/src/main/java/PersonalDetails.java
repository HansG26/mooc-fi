
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int longestLength = 0;
        int numberOfInputs = 0;
        int sum = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(",");
            
            String currentName = pieces[0];
            int currentLength = currentName.length();
            
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestName = currentName;
            }
            
            sum += Integer.valueOf(pieces[1]);
            numberOfInputs++;
            
        }
        
        System.out.println("Longest name: " + longestName);
        
        double avg = (double) sum / (double) numberOfInputs;
        System.out.println("Average of the birth years: " + avg);

    }
}
