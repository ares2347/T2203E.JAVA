package session_2;

import java.util.Scanner;

public class Demo_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //int x = sc.nextInt() -> scanf("%d", &x);
//        System.out.println("intput value to print:");
//        int x = sc.nextInt();
//        System.out.println(x);
//        System.out.println("intput value to print:");
//        System.out.println(sc.nextInt());

//        Human h = new Human();
//        h.run(5);
//
//        int[] marks = new int[4];
//        marks[0] = 19;
//
//        //forEach can return and break
//        for (int mark: marks ){
//            System.out.println(mark);
//        }

        Account a = new Account("a1","HT",200000);
        Account b = new Account("a2","ML",100000);

        a.transferTo(-50000, b);

    }
}
