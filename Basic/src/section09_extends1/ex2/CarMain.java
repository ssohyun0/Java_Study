package section09_extends1.ex2;

import section09_extends1.ex2.GasCar;
import section09_extends1.ex2.ElectricCar;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
