package exercises.technology.test;

import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.SmartPhone;

import org.junit.*;

import static org.junit.Assert.*;

public class Tests {
    Computer myTestComputer = new Computer("Mac", "11.3.2", Computer.assignSerialNum());

// Computer test 1 - Battery power of computer set correctly
    @Test
    public void checkComputerPowerCorrect() {
        System.out.println(myTestComputer.getPower());
        System.out.println(myTestComputer.toString());
        assertFalse(myTestComputer.getPower());
    }
// Computer test 2 - OS correctly set
    @Test
    public void checkComputerBrandCorrect() {
        assertEquals("Mac", myTestComputer.getBrand());
    }
// Computer test 3 - Battery power of computer set correctly
    @Test
    public void checkComputerOsCorrect() {
        assertEquals("11.3.2", myTestComputer.getOs());
    }

    Laptop myTestLaptop = new Laptop("Windows", "10.123.434355", Laptop.assignSerialNum());

    // Laptop test 1 - Battery power of computer set correctly
    @Test
    public void checkLaptopPowerCorrect() {
        assertTrue(myTestLaptop.getPower());
    }
// Laptop test 2 - OS correctly set
    @Test
    public void checkLaptopBrandCorrect() {
        assertEquals("Windows", myTestLaptop.getBrand());
    }
// Laptop test 3 - Battery power of computer set correctly
    @Test
    public void checkLaptopOsCorrect() {
        assertEquals("10.123.434355", myTestLaptop.getOs());
    }

    SmartPhone myTestPhone = new SmartPhone("Apple","14.2.3", SmartPhone.assignSerialNum());

    // Phone test 1 - Battery power of computer set correctly
    @Test
    public void checkPhonePowerCorrect() {
        assertTrue(myTestPhone.getPower());
    }
    // Phone test 2 - OS correctly set
    @Test
    public void checkPhoneBrandCorrect() {
        assertEquals("Apple", myTestPhone.getBrand());
    }
    // Phone test 3 - Battery power of computer set correctly
    @Test
    public void checkPhoneOsCorrect() {
        assertEquals("14.2.3", myTestPhone.getOs());
    }

    // Total test 1 - Check that item serial numbers don't match
    @Test
    public void checkSerialNumbersDontMatch() {
        int compSerial = myTestComputer.getSerialNum();
        int laptopSerial = myTestLaptop.getSerialNum();
        int phoneSerial = myTestPhone.getSerialNum();
        boolean checkSerial = compSerial != laptopSerial && laptopSerial != phoneSerial && phoneSerial != compSerial;

        assertFalse(checkSerial);
    }
}
