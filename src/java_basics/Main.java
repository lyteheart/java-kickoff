package java_basics;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int x, y, z;
//        // write your code here
//        Scanner sc =new Scanner(System.in);
//        x=sc.nextInt();
//        y=sc.nextInt();
//        z=sc.nextInt();
//        if((x+y)>z && (y+z)>x && (x+z)>y){
//            if(x==y && y==z && x==z){
//                System.out.println("Equilateral");
//            }else if(x==y || y==z || z==x){
//                System.out.println("Isosceles");
//            }else{
//                System.out.println("Scalene");
//            }
//        }else{
//            System.out.println("Not a Triangle");
//        }
//        sc.close();

//        Scanner sc=new Scanner(System.in);
//        byte age=sc.nextByte();
//        double income=sc.nextDouble();
//        boolean hasLoan=sc.nextBoolean();
//
//        if(age>=18){
//            if(hasLoan){
//                System.out.println("You are not eligible for the loan.");
//            }else{
//                System.out.println("You are eligible for the loan.");
//            }
//        }else{
//            System.out.println("You are not eligible for the loan.");
//        }

//        Scanner sc = new Scanner(System.in);
//        short num=sc.nextShort();
//
//        if(num>=0){
//            for(int i=1;i<=10;i++){
//                System.out.println(num*i);
//            }
//        }else{
//            System.out.println("enter a valid number");
//        }

//        --------------
//        Scanner sc = new Scanner(System.in);
//        byte n=sc.nextByte();
//        short sum=0;
//
//        for(int i=1;i<=n;i++){
//            sum+=i;
//        }
//        System.out.println(sum);


        // -----------
//        Scanner sc = new Scanner(System.in);
//        short num=sc.nextShort();
//        short sum=0;
//
//        for(int i=1; i<=num;i++){
//            if(i%2==0){
//                sum+=i;
//            }
//        }
//        System.out.println(sum);

//        ----------
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int revNum=0;
//
//        while (num>0){
//            int remainder = num % 10;
//            revNum = (revNum * 10) + remainder;
//            num = num / 10;
//
//
//        }
//        System.out.println(revNum);
//        -----------

//        Scanner sc = new Scanner(System.in);
//        int count=sc.nextInt();
//        int prevNum=0;
//        int currentNum=1;
//        // 0 1 1 2 3 5
//        do{
//            System.out.print(prevNum + " ");
//            int next = prevNum + currentNum;
//
//            prevNum=currentNum;
//            currentNum = next;
//            count--;
//
//        }while (count>0);


//        ---------
//        Scanner sc=new Scanner(System.in);
//        byte num=sc.nextByte();
//
//        for(int i=2;i<=num;i++){
//            int count=0;
//
//            for (int j=1;j<=i;j++){
//                if(i%j==0){
//                    count++;
//                }
//
//            }
//            if(count==2){
//                System.out.println(i);
//            }
//
//
//        }

//        ---------------
//        Scanner sc = new Scanner(System.in);
//        short ans=0;
//        short n=sc.nextShort();
//        for(short i=0;i<=n;i++){
//            if(i*i<=n){
//                ans=i;
//            }
//        }
//        System.out.println(ans);

//        -------

//        Scanner sc = new Scanner(System.in);
//        byte num=sc.nextByte();
//        byte choice=sc.nextByte();
//
//        int sum=0;
//        long product=1;
//
//        if(choice !=1 && choice != 2){
//            System.out.println("-1");
//            return;
//
//        }
//
//        if(choice==1){
//            for(short i=0;i<=num;i++){
//                sum+=i;
//            }
//            System.out.println(sum);
//
//        }else if(choice==2){
//            for(short i=1;i<=num;i++){
//                product = (long) product*i;
//            }
//            System.out.println(product);
//
//        }
//-----------
//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//
//        boolean found = false;
//
//        for(int i=2; i<num; i++){
//
//            if(num % i == 0){
//                System.out.print(i + " ");
//                found = true;
//            }
//        }
//
//        if(found == false) System.out.println("-1");
//        -----------

//        Scanner sc = new Scanner(System.in);
//
//        short num = sc.nextShort();
//        short power=sc.nextShort();
//        int result=1;
//
//        while (power>=1){
//            int temp=result;
//            result=temp*num;
//            power--;
//        }
//        System.out.println(result);

//        ----------
//        Scanner sc = new Scanner(System.in);
//        byte num=sc.nextByte();
//
//
//        for(int i=1;i<=num;i++){
//            int result=(3*i)+2;
//            if(result%4 != 0){
//                System.out.println(result);
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        54321
//        54321
//        54321
//        54321
//        54321
//        for (int i=num;i>=1;i--){
//            for (int j=num;j>=1; j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        ---------

//        *
//        **
//        ***
//        for (int i = 1; i <= num; i++) {
//            for (int j=1;j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        --------------
//        1
//        22
//        333
//        4444
//        55555

//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//        --------------

//        5
//        5 4
//        5 4 3
//        5 4 3 2
//        5 4 3 2 1

//        for (int i = num; i >= 1; i--) {
//            for (int j = num; j >= i; j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        -----------------
//         1
//        2 2
//       3 3 3
//      4 4 4 4
//        for (int i = 1; i <= num; i++) {
//            // Print leading spaces
//            for (int j = 1; j <= num - i; j++) {
//                System.out.print(" ");
//            }
//            // Print numbers with space
//            for (int j = 1; j <= i; j++) {
//                System.out.print("  "+ i + " ");
//            }
//            System.out.println();
//        }

//        -------------------
//        1
//        21
//        321
//        4321
//        54321
//        for (int i = 1; i <= num; i++) {
//            for (int j = i; j >=1; j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        ---------------------
//        *****
//         ****
//          ***
//           **
//            *
//
//        for (int i = num; i >= 1; i--) {
//            for (int j = 0; j < num-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        ---------------------
//        1 2 3 4 5
//        2 3 4 5 1
//        3 4 5 1 2
//        4 5 1 2 3
//        5 1 2 3 4
//        for (int i = 1; i <=num; i++) {
//            for (int j = i; j <= num ; j++) {
//                System.out.print(j+" ");
//            }
//            int p=1;
//            for (int k = p; k <i ; k++) {
//                System.out.print(p+" ");
//                p++;
//            }
//            System.out.println();
//        }
//        --------------------------
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
//        for (int i = num; i >= 1; i--) {
//            // Print leading spaces
//            for (int j = 1; j <= num - i; j++) {
//                System.out.print(" ");
//            }
//            // Print numbers with space
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//        --------------

//        12345
//        1   2
//        1   2
//        1   2
//        12345
//        for (int i = 1; i <= num; i++) {
//            if (i == 1 || i == num) {
//                for (int j = 1; j <= num; j++) {
//                    System.out.print(j);
//                }
//            } else {
//                System.out.print(1);
//
//                for (int j = 1; j <= num - 2; j++) {
//                    System.out.print(" ");
//                }
//
//                System.out.print(2);
//            }
//            System.out.println();
//        }
//        ------------------
//        AAAA
//        BBBB
//        CCCC
//        DDDD

//        for (int i = 1; i <=num; i++) {
//            for (int j = 1; j <=num; j++) {
//                char jthChar=(char)('A'+ i-1);
//                System.out.print(jthChar);
//            }
//            System.out.println();
//        }


//        ----------------------
//        E
//        DE
//        CDE
//        BCDE
//        ABCDE


//        for (int i = num; i>=1; i--) {
//            for (int j = i; j <=num; j++) {
//                char jthChar=(char)('A'+ j-1);
//                System.out.print(jthChar);
//            }
//            System.out.println();
//        }

//        ------------------
//        55555
//        4444
//        333
//        22
//        1
//        for (int i = num; i >= 1; i--) {
//
//            for (int j = i; j >= 1; j--) {
//                System.out.print(i);
//            }
//            for (int j = 0; j < num - i; j++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }


//        --------------------
//            1
//           232
//          34543
//         4567654
//        567898765
//        for (int i = 1; i <= num; i++) {
//            // Print leading spaces
//            for (int j = 1; j <= num - i; j++) {
//                System.out.print(" ");
//            }
//            int p=i;
//
//            // Print numbers with space
//            for (int j = 1; j <= i; j++) {
//                System.out.print(p);
//                p++;
//            }
//            int q = i + (i - 2);
//            for (int k = 1; k < i; k++) {
//                System.out.print(q);
//                q--;
//
//            }
//            System.out.println();
//        }
//        ------------------
//        1 2 3 4 5
//         2 3 4 5
//          3 4 5
//           4 5
//            5
//           4 5
//          3 4 5
//         2 3 4 5
//        1 2 3 4 5
//        for (int i = 1; i <=num ; i++) {
//            for (int j = 1; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = i; k <=num ; k++) {
//                System.out.print(k+" ");
//            }
//            System.out.println();
//        }
//        for (int i = num - 1; i >= 1; i--) {
//
//            for (int j = 1; j < i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int k = i; k <= num; k++) {
//                System.out.print(k+" ");
//            }
//
//            System.out.println();
//        }
//        ----------------
//        for Input 3 :-
//          *
//         ***
//        *****


//        for (int i = 1; i <= num; i++) {
//            // Print leading spaces
//            for (int j = 1; j <= num - i; j++) {
//                System.out.print(" ");
//            }
//            // Print numbers with space
//            for (int j = 1; j <= (2*i)-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        -----------------
//        E
//        ED
//        EDC
//        EDCB
//        EDCBA

//        for (int i = num; i >=1; i--) {
//
//            for (int j = num; j >=i ; j--) {
//                char jthChar=(char)('A'+j-1);
//
//                System.out.print(jthChar);
//            }
//            System.out.println();
//        }

//        --------------------------
//          *
//         ***
//        *****
//         ***
//          *
//        for (int i = 1; i <= num; i+=2) {
//            // Print leading spaces
//            for (int j = 1; j <= (num - i)/2; j++) {
//                System.out.print(" ");
//            }
//            // Print numbers with space
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//        for (int i = num-2; i >= 1; i -= 2) {
//            // Print leading spaces
//            for (int j = 1; j <= (num - i)/2; j++) {
//                System.out.print(" ");
//            }
//            // Print numbers with space
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        ----------------------
//        for input 6
//              1
//             1 1
//            1 2 1
//           1 3 3 1
//          1 4 6 4 1
//        1 5 10 10 5 1

//        for (int i = 0; i < num; i++) {
//
//            int value = 1;
//
//            for (int j = 0; j <= i; j++) {
//                System.out.print(value + " ");
//
//                value = value * (i - j) / (j + 1);
//            }
//
//            System.out.println();
//        }
//        ----------------------
//        for input 5
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E
//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j <= i; j++) {
//                char jthChar = (char) ('A' + j - 1);
//                System.out.print(jthChar+" ");
//            }
//            System.out.println();
//        }
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

//        5432*
//        543*1
//        54*21
//        5*321
//        *4321

//        for (int i = 1; i <=num; i++) {
//            int star = i;
//            for (int j = num; j >= 1; j--) {
//                if (j == star) {
//                    System.out.print("*");
//
//                } else {
//                    System.out.print(j);
//                }
//
//            }
//            System.out.println();
//        }

        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int oddSum=0;
        int evenSum=0;

        while(num>0){
            int n=num%10;
            if((n%2)==0){
                evenSum=evenSum+n;
            }else{

                oddSum=oddSum+n;
            }
            num = num/10;
        }
        System.out.println(evenSum);
        System.out.println(oddSum);

    }
}

