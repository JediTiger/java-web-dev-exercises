package OneB;

import java.util.ArrayList;
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

    static void printSpecificWords(Integer searchText) {
        ArrayList<String> phraseWords = new ArrayList<>(["Little", "fuzzy", "was", "a", "bear", "pear", "mare", "care"]);
        phraseWords = ["Little", "fuzzy", "was", "a", "bear", "pear", "mare", "care"];
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
        System.out.println("The values used for computation are: " + values);

        System.out.println("The total of the even integers is: " + sumEvenValues(values));
// Part 2
        printSpecificWords(5);
// Part 3
        Scanner input = new Scanner(System.in);
        System.out.println("What length of word to search for?");
        int length = input.nextInt();
        printSpecificWords(length);
// Part 4
        //
   }

}