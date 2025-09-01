//polymorphism means one form many behaviour or method/operator/object that perform different tasks in different situations

//Method Overloading
//Same method name, but different parameters like number of para or data-type.
//compile time and Static Binding
class Calculator {
    // method with 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    // method overloaded with 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // method overloaded with different data types
    double add(double a, double b) {
        return a + b;
    }
}

public class Compile_time_Poly_Method {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));       
        System.out.println(calc.add(2, 3, 4));    
        System.out.println(calc.add(2.5, 3.5));   
    }
}
