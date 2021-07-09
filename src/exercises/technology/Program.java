package exercises.technology;

import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.SmartPhone;

public class Program {
    public static void main(String[] args) {
        Computer myComputer = new Computer("Mac","11.3.2",Computer.assignSerialNum());
        System.out.println(myComputer.toString());

        Laptop myLaptop = new Laptop("Windows","10.123.434355",Computer.assignSerialNum());
        System.out.println(myLaptop.toString());

        SmartPhone myPhone = new SmartPhone("Apple","14.2.3",Computer.assignSerialNum());
        System.out.println(myPhone.toString());
    }
}
