// The method in the child class must have the same name, return type, and parameters as in the parent class.
// If parent’s method is public, child cannot make it protected or private.
class Bank {
    double getRateOfInterest() {
        return 0.0; // Default
    }
}
// Static methods cannot be overridden (they are hidden, not overridden).
// Child classes override the method
class SBI extends Bank {
    double getRateOfInterest() {
        return 5.5;
    }
}

class HDFC extends Bank {
    double getRateOfInterest() {
        return 6.2;
    }
}

class ICICI extends Bank {
    double getRateOfInterest() {
        return 6.8;
    }
}
// Constructors and  private method and Final methods cannot be overridden.

public class Runtime_Poly_Method_Overr {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Interest Rate: " + b.getRateOfInterest() + "%");

        b = new HDFC();
        System.out.println("HDFC Interest Rate: " + b.getRateOfInterest() + "%");

        b = new ICICI();
        System.out.println("ICICI Interest Rate: " + b.getRateOfInterest() + "%");
    }
}
