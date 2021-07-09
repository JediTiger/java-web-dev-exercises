package exercises.technology;

import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.SmartPhone;

public class Program {
    public static void main(String[] args) {
        Computer myComputer = new Computer("Mac",false,Computer.assignSerialNum());
        System.out.print(myComputer.toString());

        Laptop myComputer = new Computer("Mac",false,Computer.assignSerialNum());
        System.out.print(myComputer.toString());

        Computer myComputer = new Computer("Mac",false,Computer.assignSerialNum());
        System.out.print(myComputer.toString());
    }
}
