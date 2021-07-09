package exercises.technology;

public class Computer {

    // Declarations
    private static String brand;
    private static String os;
    private static int power;
    private static String internet;
    private static int serialNum;

    // Constructor(s)
    private static void Computer(String brand, String os, int power, String internet, int serialNum) {
        this.brand = brand;
        this.os = os;
        this.power = power;
        this.internet = internet;
        this.serialNum = serialNum;
    }

    // Getters and Setters
    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String aBrand) {
        brand = aBrand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        os = aOs;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int aPower) {
        power = aPower;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String aInternet) {
        internet = aInternet;
    }

    public String getSerialNum() {
        return serialNum
    }

    public void setSerialNum(int aSerialNum) {
        serialNum = aSerialNum;
    }

    /**** Instance Methods ****/

    // A cat is rested and hungry after it sleeps
    public void sleep() {
        tired = false;
        hungry = true;
    }

    // Eating makes a cat not hungry
    public void eat() {

        // eating when not hungry makes a cat sleepy
        if (!hungry) {
            tired = true;
        }

        hungry = false;
    }

}
