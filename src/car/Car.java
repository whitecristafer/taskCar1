package car;

public abstract class Car {
    String model;
    int enginePower;
    int torque;

    public Car(String model, int enginePower, int torque) {
        this.model = model;
        this.enginePower = enginePower;
        this.torque = torque;
    }

    public abstract void showInfo();
    public abstract int countPrice();
}