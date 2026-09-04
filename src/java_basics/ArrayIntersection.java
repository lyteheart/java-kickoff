package java_basics;

public class ArrayIntersection {
//    Problem
//    Given two arrays, print the common elements.
//    Example:
//    ARR1 = [2, 6, 8, 5, 4, 3]
//    ARR2 = [2, 3, 4, 7]
//    Output:
//            2 4 3
//    Note:
//    Output order follows ARR1.
//    Duplicates must be handled correctly.
//    Once an element from ARR2 is matched, it cannot be reused.
//-----------------------

//    Why Integer.MIN_VALUE?
//    arr2[j]=Integer.MIN_VALUE;
//
//    Marks the
//    matched element
//    as already
//    used.
//
//            Example:
//
//    Before:
//            [2,3,4,7]
//
//    After matching 2:
//            [MIN,3,4,7]


    //    -----------------------
//    Dry Run
//    ARR1 =[2,6,8,5,4,3]
//    ARR2 =[2,3,4,7]
//
//            2->match ->print 2
//    ARR2 =[MIN,3,4,7]
//
//            6->
//    no match
//
//8->
//    no match
//
//5->
//    no match
//
//4->match ->print 4
//    ARR2 =[MIN,3,MIN,7]
//
//            3->match ->print 3
//    ARR2 =[MIN,MIN,MIN,7]
//
//    Output:
//            2 4 3

    public static void intersections(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
