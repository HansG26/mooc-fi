
import java.util.Scanner;


public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        PaymentCard card = new PaymentCard(10);
        System.out.println("Paul: " + card);
        
        card.addMoney(-15);
        System.out.println("Paul: " + card);


    }
}
