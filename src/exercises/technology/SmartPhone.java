package exercises.technology;

public class SmartPhone extends Computer {
    public SmartPhone(String brand, String os, int serialNum) {
        super(brand, os, serialNum);
        setPower(true);
    }
}
