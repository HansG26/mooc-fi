
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        Person pekka = new Person("Pekka");
        Person antti = new Person("Antti");
        
        int i = 0;
        
        while (i < 30) {
            pekka.growOlder();
            i++;
        }
        
        antti.growOlder();
        
        System.out.println(pekka);
        System.out.println(antti);
        

    }
        
}
