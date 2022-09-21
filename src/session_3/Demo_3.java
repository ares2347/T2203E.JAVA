package session_3;

import java.util.ArrayList;

public class Demo_3 {
    public static void main(String[] args){
        int[] intArrays = new int[5];
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add("Hello world");
        arrayList.remove(10);

        //ArrayList not working with primitive
        ArrayList<String> strArr = new ArrayList<>();
        for (String s: strArr){
            System.out.println(s);
        }
        strArr.add("Hello world");
        //work with String
        strArr.remove("Hello world");


        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i: intArr){
            System.out.println(i);
        }
        intArr.add(10);
        intArr.remove(0); //works with index
        //arr length: strArr.size()
    }
}
