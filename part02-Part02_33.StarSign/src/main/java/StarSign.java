
public class StarSign {

    public static void main(String[] args) {

        printSquare(4);
        
    }

    public static void printStars(int number) {
        // first part of the exercise

        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        
        System.out.println("");
    }

    public static void printSquare(int size) {
        
        // second part of the exercise
        for(int i = 0; i < size; i++) {
            printStars(size);
        }
        
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
    }
}
