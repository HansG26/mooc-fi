
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        Person ada = new Person("Ada");
        Person antti = new Person("Antti");
        Person martin = new Person("Martin");
        
        ada.printPerson();
        antti.printPerson();
        martin.printPerson();
        
        ada.growOlder();
        ada.growOlder();
        
        ada.printPerson();
        antti.printPerson();
    }
        
}
