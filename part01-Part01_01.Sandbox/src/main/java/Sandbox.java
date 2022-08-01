
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {

        double number = 4 * alwaysReturnsTen() + (alwaysReturnsTen() / 2) - 8;
        System.out.println("the result of the calculation " + number);
        
    }

    public static int alwaysReturnsTen() {
        return 10;
    }

}
