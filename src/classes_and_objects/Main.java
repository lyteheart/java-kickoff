package classes_and_objects;

public class Main {

    public static void main(String[] args) {
        DynamicArray dArr=new DynamicArray();
        dArr.add(10);
        dArr.add(20);
        dArr.add(30);
        dArr.add(40);
        dArr.add(50);
//        dArr.set(4,111);
        dArr.remove(1);
//        System.out.println(dArr.removeLast());
//        System.out.println(dArr.removeLast());
        dArr.print();
    }
}
