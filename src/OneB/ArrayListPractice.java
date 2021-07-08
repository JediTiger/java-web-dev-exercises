package OneB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
// Part 1b
    static Integer sumEvenValues(ArrayList<Integer> intValues) {
        int sumTotal = 0;
        int counter = 0;
        for ( int i = 0; i < intValues.size()+1; i++ ) {
            if (i % 2 == 0) {
                counter = counter + 1;
                sumTotal = sumTotal + i;
            }
        }
        System.out.println("Number of integers counted: " + counter);
        return sumTotal;
    }

    static void printSpecificWords(Integer searchText, Integer choice) {
        String[] words;
        String text;
        if (choice == 1) {
            words = new String[]{"Little", "fuzzy", "wuzzy", "bear", "mare", "care", "chicken"};
            text = words.toString();
        }
        else {
            text = ArrayPractice.text;
            words = text.split(" ");
        }
        ArrayList<String> phraseWords = new ArrayList<>(Arrays.asList(words));
        System.out.println("Words of length " + searchText + " found in " + text);
        for ( String item : phraseWords ) {
            if (item.length() == searchText) {
                System.out.println(item);
            }
        }
    }

// Part 1a
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            values.add(i);
        }
        System.out.println("Part 1 - Write a static method to find the sum of all the even numbers in an ArrayList:\n");
        System.out.println("The values used for computation are: " + values);

        System.out.println("The total of the even integers is: " + sumEvenValues(values));
// Part 2
        System.out.println("\nPart 2 - Write a static method to print out each word in a list that has exactly 5 letters:\n");
        printSpecificWords(5,1);
// Part 3
        System.out.println("\nPart 3 - Modify your code to prompt the user to enter the word length for the search:\n");
        Scanner input = new Scanner(System.in);
        System.out.println("What length of word to search for?");
        int length = input.nextInt();
        printSpecificWords(length, 2);
// Part 4
        System.out.println("\nPart 4 - Modify your code to use the text string from ArrayPractice:\n");
        input = new Scanner(System.in);
        System.out.println("What length of word to search for?");
        length = input.nextInt();
        printSpecificWords(length,2);
        //
   }

}