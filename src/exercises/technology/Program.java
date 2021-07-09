package exercises.technology;

import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.SmartPhone;

public class Program {
    public static void main(String[] args) {

        Computer myComputer = new Computer("Mac",false,100);
        System.out.print(myComputer.toString());
    }
}
