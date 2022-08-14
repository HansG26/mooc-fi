
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        
        Rectangle first = new Rectangle(40, 80);
        Rectangle rectangle = new Rectangle(10, 10);
        System.out.println(first);
        System.out.println(rectangle);
        
        first.narrow();
        System.out.println(first);
        System.out.println(first.surfaceArea());
    }
        
}
