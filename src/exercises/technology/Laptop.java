package exercises.technology;

public class Laptop extends Computer {
    protected Laptop(String brand, String os, int serialNum) {
        super(brand, os, serialNum);
        setPower(true);
    }
}
