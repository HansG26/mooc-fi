
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        
        Clock clock = new Clock();
        
        while (true) {
            System.out.println(clock);
            clock.advance();
        }
    }
        
}
