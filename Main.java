//abstract class cannot be instantiated -you cannot create objects
//it having the abstract method - without bidy just declared
//non abstract method - with implementation
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Normal method with implementations
    //void sleep(){
    // System.out.println("Sleep..........");
    // }




    //if a method is having the abstract keyword it shuld be override in the inherited class
    abstract void sleep();
}

class Dog extends Animal {
    // Implementing abstract method
    void sound() {
        System.out.println("Dog barks");
    }
    void sleep()
    {
        System.out.println("sleep.......");
    }
}
//at a time only one class can be extend
class Cat extends Animal {
    void sound() {

        System.out.println("Cat meows");
    }
    void sleep()
    {
        System.out.println("sleep........");
    }
}
//main class
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog(); 
        a1.sound();  // Dog barks
        a1.sleep();

        Animal a2 = new Cat();
        a2.sound();  // Cat meows
        a2.sleep();
    }
}

