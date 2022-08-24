
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye Bye!");
                return;
            }
            
            if(command.equals("add")) {
                System.out.println("Word:");
                String word = this.scanner.nextLine();
                System.out.println("Translation:");
                String tanslation = this.scanner.nextLine();
                
                this.simpleDictionary.add(word, tanslation);
                continue;
            }
            
            if(command.equals("search")) {
                System.out.println("To be translated:");
                String word = this.scanner.nextLine();
                
                String translation = this.simpleDictionary.translate(word);
                
                if(translation == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }
                
    
                continue;
            }

            System.out.println("Unknown command");
        }

    }
}
