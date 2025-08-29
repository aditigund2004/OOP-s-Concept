class Student {
    // private data member (hidden from outside)
    private String name;
    private int age;

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for age
    public int getAge() {
        return age;
    }

    // setter for age
    public void setAge(int age) {
        if (age > 0) {   // validation
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}
// Encapsulation = Wrapping variables and methods together + Data hiding using access modifiers.
public class EncapsulationExample {
    public static void main(String[] args) {
        Student s1 = new Student();

        // setting values using setter methods
        s1.setName("Aditi");
        s1.setAge(21);

        // getting values using getter methods
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}

