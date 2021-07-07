package OneB;

import java.util.ArrayList;

public class ArrayListPractice {

    static Integer sumEvenValues(ArrayList<Integer> intValues) {
        int sumTotal = 0;
        int counter = 0;
        for ( int i = 0; i < intValues.size()+1; i++ ) {
            if (i % 2 == 0) {
                counter = i++;
                sumTotal = sumTotal + i;
            }
        }
        return sumTotal;
    }

    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            values.add(i);
        }
        System.out.println("The values used for computation are: " + values);

        System.out.println("The total of the even integers is: " + sumEvenValues(values));
   }

}