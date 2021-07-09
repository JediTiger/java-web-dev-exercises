package exercises.technology.test;

import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.SmartPhone;

import java.util.*;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Tests {
    Computer myComputer = new Computer("Mac", "11.3.2", Computer.assignSerialNum());
    Laptop myLaptop = new Laptop("Windows", "10.123.434355", Computer.assignSerialNum());
    SmartPhone myPhone = new SmartPhone("Apple"),"14.2.3",Computer.assignSerialNum());

// Computer test 1 - Battery power of computer set correctly
    @Test
    public void checkPowerCorrect() {
        assertEquals(false, myComputer.getPower());
    }
    // Computer test 2 - OS correctly set
    @Test
    public void checkBrandCorrect() {
        assertEquals("Mac", myComputer.getBrand());
    }
    // Computer test 3 - Battery power of computer set correctly
    @Test
    public void checkOsCorrect() {
        assertEquals("14.2.3", myComputer.getOs());
    }

}
