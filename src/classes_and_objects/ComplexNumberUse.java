package classes_and_objects;

public class ComplexNumberUse {
    private int realPart;
    private int ImagPart;

    ComplexNumberUse(int realPart, int ImagPart) {
        this.realPart = realPart;
        this.ImagPart = ImagPart;
    }

    protected void plus(ComplexNumberUse c2) {
        this.realPart += c2.realPart;
        this.ImagPart += c2.ImagPart;
    }

    protected void multiply(ComplexNumberUse c2) {
        this.realPart = (this.realPart * c2.realPart) - (this.ImagPart * c2.ImagPart);
        this.ImagPart = (this.realPart * c2.ImagPart) + (this.ImagPart * c2.realPart);
    }


    public void print() {
        System.out.println(realPart + " + " + "i" + ImagPart);
    }


}
