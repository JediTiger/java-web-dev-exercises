package OneB;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
// Part 1
        System.out.println("Part 1 - Print the whole array:");
        for (int arrayItem : integerArray) {
            System.out.println(arrayItem);
        }
// Part 2
        System.out.println("\nPart 2 - Print only the odd values:");
        for (int arrayItem : integerArray) {
            int checkArrayItemOdd = arrayItem % 2;
            if (checkArrayItemOdd != 0) { // number is odd, print. If not, don't
                System.out.println(arrayItem);
            }
        }
// Part 3
        System.out.println("\nPart 3 - Split a text string into words");
        String text = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = text.split(" ");
// Part 4
        System.out.println("\nPart 4 - Print the string to confirm the phrase was split into words");
        for (String letters : words ) {
            System.out.println(letters);
        }
// Part 5
        System.out.println("\nPart 5 - Split phrase into sentences");
        String[] sentences = text.split("\\.");
        for (String letters : sentences ) {
            System.out.println(letters);
        }
    }
}