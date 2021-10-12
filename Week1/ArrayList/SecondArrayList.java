package Week1.ArrayList;

import java.util.ArrayList;
public class SecondArrayList {
    public static void main(String[] args){

        // first list
        ArrayList<Integer> list = new ArrayList<>();

        // adding elements to first list
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        System.out.println(list);

        // second list
        ArrayList<Integer> list2 = new ArrayList<>();

        //adding elements to second list
        list2.add(1);
        list2.add(3);
        list2.add(5);
        list2.add(7);

        // adding all the elements of first list in the second list using addAll() method ( at the end )
        list2.addAll(list);// appends another arraylist at the end 
        System.out.println(list2);

        // third list 
        ArrayList<Integer> list3 = new ArrayList<>();

        // adding elements to list3
        list3.add(0);
        list3.add(10);

        //adding all elements of list2 at a specified index
        list3.addAll(1,list2);
        System.out.println(list3);
    }
}
