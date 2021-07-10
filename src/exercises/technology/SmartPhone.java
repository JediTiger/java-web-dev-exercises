package exercises.technology;

public class SmartPhone extends Computer {
        public SmartPhone(String brand, String os, int serialNum) {
            super(brand, os, serialNum);
        setPower(true);

            public boolean getPower() {
                return this.power;
            }

            public void setPower(boolean aPower) {
                power = aPower;
            }

        }
}
