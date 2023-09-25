package org.launchcode;

import java.util.Scanner;

public class StringsSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Alice = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";
        System.out.println("Please enter a term to search for.");
        String search = input.next();
        Integer index = Alice.indexOf(search);
        Integer length = search.length();
        if (Alice.contains(search)) {
            System.out.println("Your word appears in the sentence at index " + index + ". Your term is " + length
            +" characters long.") ;
        } else {System.out.print("Your word does not appear in the sentence.");
        };

    }
}
