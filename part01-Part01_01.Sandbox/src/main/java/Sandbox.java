
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

public class Sandbox {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        
        System.out.println("today is " + day + "." + month + "." + year);
        
    }
        
}
