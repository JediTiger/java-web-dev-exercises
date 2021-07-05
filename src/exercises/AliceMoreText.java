package exercises;

import java.util.Scanner;

public class AliceMoreText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstAliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Enter a word to search the first sentence of Alice in Wonderland: ");
        String term = input.next();
        boolean searchResult =  firstAliceSentence.toLowerCase().contains(term.toLowerCase());
        int indexOfResult = firstAliceSentence.indexOf(term);
        String[] splitSentenceToArray = firstAliceSentence.split(", ");
        if (searchResult) {
            System.out.println("The search term '" + term + "' WAS found in the text at index of " + indexOfResult + " with a length of " + term.length());
        }
        else {
            System.out.println("The search term '" + term + "' was NOT found in the text: ");
        }
        System.out.println("\nOriginal text:");
        System.out.println(splitSentenceToArray[0] + ", ");
        System.out.println(splitSentenceToArray[1]);
        System.out.println(splitSentenceToArray[2] + ", " + splitSentenceToArray[3]);

        System.out.println("\nAltered text:");
        String alteredSentence = firstAliceSentence.toLowerCase().replace(term.toLowerCase(), "");
        String[] splitUsingTerm = alteredSentence.split(", ");
        System.out.println(splitUsingTerm[0] + ", ");
        System.out.println(splitUsingTerm[1]);
        System.out.println(splitUsingTerm[2] + ", " + splitUsingTerm[3]);


    }
}
