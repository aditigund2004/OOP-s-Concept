/*
Multilevel inheritance is when a class is derived from another derived class.

        Forms a chain of inheritance
        Child class gets features of all parent levels
        Used to build structured real-world systems
        Promotes code reuse and organization

*/

class Person {
    void showPerson() {
        System.out.println("This is a person");
    }
}

class Student extends Person {
    void showStudent() {
        System.out.println("This is a student");
    }
}

class CollegeStudent extends Student {
    void showCollegeStudent() {
        System.out.println("This is a college student");
    }
}

public class Main {
    public static void main(String[] args) {

        CollegeStudent cs = new CollegeStudent();

        cs.showPerson();         
        cs.showStudent();        
        cs.showCollegeStudent(); 
    }
}