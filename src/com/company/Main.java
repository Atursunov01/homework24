package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Integer[] array = new Integer[7];
        Random random = new Random();
        ArrayList<Integer> arrayList  = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i <=6 ; i++){
         array[i] = random.nextInt(2);
         arrayList.add(random.nextInt(2));
         linkedList.add(random.nextInt(2));
            System.out.print(array[i] +  ", ");
        }
        System.out.println();
        System.out.println( arrayList);
        System.out.println(linkedList);
        System.out.println( );

        System.out.println(method(array) );
        System.out.println(method(arrayList));
        System.out.println(method(linkedList));
    }
    public static String  method(Integer[] array) {
        Arrays.sort(array);
        return Arrays.toString(array) ;
    }
    public static String  method(  ArrayList<Integer> arrayList  ) {
        Collections.sort(arrayList);
    return Arrays.toString(new ArrayList[] {arrayList});
}
    public static String method(LinkedList<Integer>linkedList){
        Collections.sort(linkedList);
        return Arrays.toString(new LinkedList[] {linkedList});
    }
}