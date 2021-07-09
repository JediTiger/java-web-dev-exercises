package exercises.technology.test;

import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.SmartPhone;

import java.util.*;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Tests {
    Computer myComputer = new Computer(Computer.setBrand("Mac"), "11.3.2", Computer.assignSerialNum());
    Laptop myLaptop = new Laptop(Laptop.setBrand("Windows"), "10.123.434355", Computer.assignSerialNum());
    SmartPhone myPhone = new SmartPhone(SmartPhone.setBrand("Apple"),"14.2.3",Computer.assignSerialNum());

// Computer test 1 - Battery power of computer set correctly
    @Test
    public void checkPowerCorrect() {
        assertEquals(false, Computer.getPower());
    }
    @Test
    public void checkOsCorrect() {
        assertEquals("Mac", Computer.getBrand());
    }
    @Test
    public void inheritsSuperInFirstConstructor() {
        assertEquals("14.2.3", Computer.getOs());
    }

}
