package exercises.technology;

public class Computer {

// Declarations
    private static String brand;
    private static String os;
    protected static boolean power = false;
    private static int serialNum;
    protected static int assignedSerialNum = 1;

// Overrides
    @Override
    public String toString() {
        String label = "Brand: " + brand + "OS: " + os + ", Battery?: " + power + ", Serial Number: " + serialNum;
        return label;
    }

// Constructor(s)
    public Computer(String brand, String os, int serialNum) {
        this.brand = brand;
        this.os = os;
        this.serialNum = serialNum;
    }

// Getters and Setters
    public static String getBrand() {
        return brand;
    }

    public void setBrand(String aBrand) {
        brand = aBrand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String aOs) {
        os = aOs;
    }

    public boolean getPower() {
        return power;
    }

    public void setPower(boolean aPower) {
        power = aPower;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int aSerialNum) {
        serialNum = aSerialNum;
    }

/* Instance methods */

// Assign a new item a unique serial number
    public static int assignSerialNum() {
        return assignedSerialNum = assignedSerialNum + 100;
    }

}
