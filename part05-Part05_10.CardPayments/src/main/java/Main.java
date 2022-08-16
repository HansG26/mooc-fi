
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        PaymentCard petesCard = new PaymentCard(10);
        
        System.out.println("money " + petesCard.balance());
        boolean wasSuccesful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccesful);
        System.out.println("money " + petesCard.balance());
        
        wasSuccesful = petesCard.takeMoney(4);
        System.out.println("succesfuly withdrew: " + wasSuccesful);
        System.out.println("money " + petesCard.balance());
    }
}

