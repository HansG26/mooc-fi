
public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name) {
        this(name, 0, 0, 0);
    }


    public void growOlder() {
        this.age++;
    }

    public double bodyMassIndex() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }

    public String toString() {
        return this.name + " is " + this.age + " years old, their BMI is " + this.bodyMassIndex();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }

}
