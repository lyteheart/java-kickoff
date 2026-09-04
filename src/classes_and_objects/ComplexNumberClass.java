package classes_and_objects;

public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumberUse c1=new ComplexNumberUse(3,4);
        // c1.plus(new ComplexNumberUse(1,3));
        c1.multiply(new ComplexNumberUse(1,3));

        c1.print();
    }
}
