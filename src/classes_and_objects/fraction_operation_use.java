package classes_and_objects;

public class fraction_operation_use {

    public static void main(String[] args) {
        Fraction_operation f1=new Fraction_operation(2,3);
//        f1.setNumerator(12);
//        f1.setDenominator(0);

        f1.addFraction(3,4);
        f1.subtractFraction(1,2);
        f1.divideFraction(1,2);
    }
}
