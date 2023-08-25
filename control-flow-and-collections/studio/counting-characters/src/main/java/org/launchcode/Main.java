package org.launchcode;

import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main{
    public static void main(String[] args) {
        String Hidden = "If the product of two terms is zero then common sense says at least one of the two" +
                " terms has to be zero to start with. So if you move all the terms over to one side, you can " +
                "put the quadratics into a form that can be factored allowing that side of the equation " +
                "to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = Hidden.toCharArray();

    HashMap<Character, Integer> characterCount = new HashMap<>();
        //loop through the array and collect each character
        for(char letter: charactersInString){
            if (characterCount.containsKey(letter)) {
                characterCount.put(letter, characterCount.get(letter) +1);
            } else {
                characterCount.put(letter, 1);
            }
        }
        for (Map.Entry<Character, Integer> count:characterCount.entrySet()){
            System.out.println(count.getKey() + " : " + count.getValue());
        }
    }


}