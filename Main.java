package com.teksystems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // explore the differences between standard arrays and ArrayLists/Collections

        String[] arr = new String[10]; // simple array
        ArrayList<String> list = new ArrayList<String>(); // bigger brother, this array is created differently
        // List<String> list = new LinkedList<String>(); // does the same thing mostly as ArrayList<String>
        arr[0] = "hello"; // goes to index 0
        System.out.println(Arrays.toString(arr));

        System.out.println("-----");

        list.add("hello"); // goes to the next available sport
        list.add("world");
        list.add("again");
        System.out.println(list);
// see the difference arr has one value as hello and the rest null. list has only the three we added
        list.remove(2); // remove index 2
        System.out.println(list);
        list.set(1, list.get(1).toUpperCase()); // collection allows you to get information with the methods WAY easier.
        System.out.println(list);


    }// end method


}// end class
