
public class Person {
    private String name;
    private int age;
    
    public Person(String initialName) {
        this.name = initialName;
        this.age = 0;
    }
    
    public void growOlder() {
        if(this.age < 30) {
            age++;
        }
    }
    
    public int returnAge() {
        return this.age;
    }
    
    public boolean isOfLegalAge() {
        return this.age >= 18;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
    
}
