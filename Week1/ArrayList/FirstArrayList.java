package Week1.ArrayList;

import java.util.*;
public class FirstArrayList {
    public static void main(String[] args){
        
        //creating ArrayList
        ArrayList<String> list = new ArrayList<>();

        //adding elements to the list (append the element)
        list.add("Akash Tanwar");
        list.add("Ajay");
        list.add("Bharat");
        list.add("Divyanshu");
        list.add("Dheeraj");

        // iterating through the list using Iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+", ");
        }
        System.out.println();


        // adding the element at specified index
        list.add(0, "Akash Bhardwaj");

        // printing list using for each loop
        for(String e: list){
            System.out.print(e+", ");
        }
        System.out.println();

        //remove an element from the list
        list.remove(0);// removes element from the specified index
        list.add("Bharat");
        // printing list using a simple for loop
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        list.remove("Bharat"); // removes first occurance of the specified element
        System.out.println(list);

       list.clear(); // removes all the elements from the list
       System.out.println(list);


    }
}
