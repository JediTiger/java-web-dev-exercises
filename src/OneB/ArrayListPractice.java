package OneB;

import java.util.ArrayList;

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
        String phrase = "Little fuzzy was a bear. Little fuzzy was a pear. Little fuzzy was a mare. Little fuzzy had no care.";
        String[] phraseArr = phrase.split(" ");
        System.out.println(phraseArr);
        for ( String item : phraseArr ) {
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

        printSpecificWords(5);
   }

}