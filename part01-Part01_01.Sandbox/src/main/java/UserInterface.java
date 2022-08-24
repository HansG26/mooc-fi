
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;
    private WordSet wordSet;
    
    public UserInterface(Scanner scanner, WordSet wordSet) {
        this.scanner = scanner;
        this.wordSet = wordSet;
    }
    
    public void start() {
        while (true) {
            System.out.println("Enter a word: ");
            String word = scanner.nextLine();
            
            if(wordSet.contains(word)) {
                break;
            }
            
            wordSet.add(word);
        }
        
        System.out.println("You gave the same word twice!");
        System.out.println(this.wordSet.palindromes() + " of the words were palindromes.");
        
    }
        
}
