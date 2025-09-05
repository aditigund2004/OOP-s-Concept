//base class 
//class is user defined datatype having methods and variable.
class Vehicle {
    int wheels = 4;   // property of base class

    void start() {    // method of base class
        System.out.println("Vehicle starts with key");
    }
}
//derived class from base class

class Car extends Vehicle {
    String model = "Thar"; // property of child class

    void display() {
        // Child can access both its own and parent’s properties
        System.out.println("Car model: " + model);
        System.out.println("Number of wheels: " + wheels); // inherited from Vehicle
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Car c = new Car();
        // Using parent’s method (inherited)
        c.start();  
        // Using child’s own method
        c.display();     
    }
}
