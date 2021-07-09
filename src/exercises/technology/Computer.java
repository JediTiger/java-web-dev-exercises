package exercises.technology;

public class Computer {

    // Declarations
    private static String brand;
    private static String os;
    private static int power;
    private static String internet;
    private static int serialNum;
    protected static int assignedSerialNum = 0;

    @Override
    public String toString() {
        String label = "Brand: " + brand + ", OS: " + os + ", Power status: " + getBatteryCharge(power) + ", Internet: " + fixInternetLabel() + ", Serial Number: " + serialNum;
        return label;
    }

    // Constructor(s)
    protected Computer(String brand, String os, int power, String internet, int serialNum) {
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

    public void setOs(String aOs) {
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

    private int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int aSerialNum) {
        serialNum = aSerialNum;
    }

    /* Instance methods */

    // Correct internet label if not a single value string
    public void fixInternetLabel() {
        if (internet == "dual") {
            internet = "Ethernet and Wifi";
        }
    }
    // Assign a new item a unique serial number
    public static int assignSerialNum() {
        return assignedSerialNum = assignedSerialNum + 1;
        }


    // For items with battery power, get the charge status
    public String getBatteryCharge(int power) {
        String charge;
        if (power == 100) {
            charge = "Fully charged";
        }
        else if (power < 100 && power > 69) {
            charge = "Good";
        }
        else if (power <=69 && power > 39) {
            charge = "Ok";
        }
        else {
            charge = "Poor";
        }
        return charge;
    }

}
