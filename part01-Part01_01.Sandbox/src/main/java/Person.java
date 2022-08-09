
public class Person {
    private String name;
    private int age;
    
    public Person(String initialName) {
        this.name = initialName;
        this.age = 0;
    }
    
    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
    
    public void growOlder() {
        if(this.age < 30) {
            age++;
        }
    }
    
    public int returnAge() {
        return this.age;
    }
    
}
