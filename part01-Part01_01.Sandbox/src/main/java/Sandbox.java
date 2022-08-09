
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        Person pekka = new Person("Pekka");
        Person antti = new Person("Antti");
        
        pekka.growOlder();
        pekka.growOlder();
        
        antti.growOlder();
        
        System.out.println("Pekka's age: " + pekka.returnAge());
        System.out.println("Antti's age: " + antti.returnAge());
        
        int combined = pekka.returnAge() + antti.returnAge();
        
        System.out.println("Combined age: " + combined);
    }
        
}
