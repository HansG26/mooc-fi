
public class Rectangle {
    private int width;
    private int height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public void widen() {
        this.width = this.width + 1;
    }
    
    public void narrow() {
        if(width > 0) {
            this.width--;
        }
    } 
    
    public int surfaceArea() {
        return this.width * this.height;
    }
    
    @Override
    public String toString() {
        return "(" + this.width + ", " + this.height + ")";
    }
}
