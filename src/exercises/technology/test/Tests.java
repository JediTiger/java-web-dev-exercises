package exercises.technology.test;

import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.SmartPhone;

import java.util.*;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Tests {
    Computer myComputer = new Computer("Mac", "11.3.2", Computer.assignSerialNum());
    Laptop myLaptop = new Laptop("Windows", "10.123.434355", Laptop.assignSerialNum());
    SmartPhone myPhone = new SmartPhone("Apple","14.2.3",SmartPhone.assignSerialNum());

// Computer test 1 - Battery power of computer set correctly
    @Test
    public void checkComputerPowerCorrect() {
        assertEquals(false, myComputer.getPower());
    }
// Computer test 2 - OS correctly set
    @Test
    public void checkComputerBrandCorrect() {
        assertEquals("Mac", myComputer.getBrand());
    }
// Computer test 3 - Battery power of computer set correctly
    @Test
    public void checkComputerOsCorrect() {
        assertEquals("14.2.3", myComputer.getOs());
    }

// Laptop test 1 - Battery power of computer set correctly
    @Test
    public void checkLaptopPowerCorrect() {
        assertEquals(false, myLaptop.getPower());
    }
// Laptop test 2 - OS correctly set
    @Test
    public void checkLaptopBrandCorrect() {
        assertEquals("Windows", myLaptop.getBrand());
    }
// Laptop test 3 - Battery power of computer set correctly
    @Test
    public void checkLaptopOsCorrect() {
        assertEquals("10.123.434355", myLaptop.getOs());
    }

    // Laptop test 1 - Battery power of computer set correctly
    @Test
    public void checkPhonePowerCorrect() {
        assertEquals(false, myPhone.getPower());
    }
    // Laptop test 2 - OS correctly set
    @Test
    public void checkPhoneBrandCorrect() {
        assertEquals("Apple", myPhone.getBrand());
    }
    // Laptop test 3 - Battery power of computer set correctly
    @Test
    public void checkPhoneOsCorrect() {
        assertEquals("14.2.3", myPhone.getOs());
    }

    // Total test 1 - Check that item serial numbers don't match
    @Test
    public void checkSerialNumbersDontMatch() {
        int compSerial = myComputer.getSerialNum();
        int laptopSerial = myLaptop.getSerialNum();
        int phoneSerial = myPhone.getSerialNum();
        boolean checkSerial = compSerial != laptopSerial && laptopSerial != phoneSerial && phoneSerial != compSerial;

        assertEquals(false, checkSerial);
    }
}
