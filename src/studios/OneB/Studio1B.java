package studios.OneB;

import java.util.HashMap;

public class Studio1B {
    public static void main(String[] args) {
        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String[] phraseAsChars = phrase.split("");
        // For Map, key will be the character, value will be the count
        // For making the Map, the initial counter value will be 0 for all entries
        HashMap<String,Integer> x = new HashMap<>();
        // Converting the character array into the Map collection
        // This loop will create keys from the characters and set the initial value to zero for all keys
        for (String item : phraseAsChars) {
            x.put(item,0);
        }
        System.out.println(x);
        // 2nd loop will iterate thru the Map and increment the values of each
//        for (HashMapitem : x) {
            //
 //       }
    }
}
