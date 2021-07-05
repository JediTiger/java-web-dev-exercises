package exercises;

import java.util.Scanner;

public class CalcMPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven: ");
        int miles = input.nextInt();
        System.out.println("Enter gallons of gas used: ");
        int gas = input.nextInt();
        int mpg = miles / gas;
        System.out.println("Your fuel economy is " + mpg + " miles per gallon.");
    }
}
