package org.example;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    //create static method to find sum of arrayList
    public static int findSum (ArrayList<Integer> arr){
        int sum = 0;
        for(int integer : arr) {
            if(integer%2 == 0) {
                sum += integer;
            }
        }
        System.out.print(sum);

        return sum;
    }

    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int i=0; i < integerArray.length; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }

        String drSeuss = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = drSeuss.split(" ");

           System.out.println(Arrays.toString(words));
        String[] sentences = drSeuss.split("\\.") ;

        //create an Arraylist
        ArrayList<Integer> myList= new ArrayList<>();
        myList.add(20);
        myList.add(15);
        myList.add(1);
        myList.add(16);
        myList.add(11);
        myList.add(15);
        myList.add(120);
        myList.add(81);
        myList.add(93);
        myList.add(70);


        //call method created for even sum
        findSum(myList);

    }




}