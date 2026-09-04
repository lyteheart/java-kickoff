package classes_and_objects;

public class Fraction_operation {
    private int numerator;
    private int denominator;

    // Constructor
    Fraction_operation(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
//        simplify();
    }

    public void setNumerator(int newNumerator) {
        this.numerator = newNumerator;
        simplify();
    }

    public void setDenominator(int newDenominator) {
        if (newDenominator <= 0) {
            System.out.println("Denominator must be greater than 0.");
            return;
        }
        this.denominator = newDenominator;
        simplify();
    }

    public void addFraction(int otherNumerator, int otherDenominator) {
        if (otherDenominator <= 0) {
            System.out.println("Denominator must be greater than 0.");
            return;
        }
        int bottomGCD = this.denominator * otherDenominator;
        int upperCalculation= (this.numerator*otherDenominator)+(otherNumerator*this.denominator);
        this.denominator=bottomGCD;
        this.numerator=upperCalculation;
        simplify();
    }

    // Subtract
    public void subtractFraction(int otherNumerator, int otherDenominator) {
        if (otherDenominator <= 0) {
            System.out.println("Denominator must be greater than 0.");
            return;
        }
        int bottomGCD = this.denominator * otherDenominator;
        int upperCalculation= (this.numerator*otherDenominator)-(otherNumerator*this.denominator);
        this.denominator=bottomGCD;
        this.numerator=upperCalculation;
        simplify();
    }

    public void divideFraction(int otherNumerator, int otherDenominator) {
        if (otherDenominator <= 0) {
            System.out.println("Denominator must be greater than 0.");
            return;
        }
        this.denominator=this.denominator * otherNumerator;
        this.numerator=this.numerator * otherDenominator;
        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
        System.out.println("Simple Version is : " + numerator + "/" + denominator);
    }


    public void print() {
        simplify();
    }

}
