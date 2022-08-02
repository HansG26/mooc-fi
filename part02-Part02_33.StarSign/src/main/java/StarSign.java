
public class StarSign {

    public static void main(String[] args) {

        printTriangle(4);
        
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
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for(int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}
