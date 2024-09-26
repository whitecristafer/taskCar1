package car;

public class ElectricCar extends Car {
    int electricPower;

    public ElectricCar(String model, int torque, int electricPower) {
        super(model, electricPower, torque);
        this.electricPower = electricPower;
    }

    @Override
    public void showInfo() {
        System.out.printf("Модель: %s%nМощность двигателя: %d кВт%nКрутящий момент: %d Н%nЦена: %d $%n",model,enginePower,torque,countPrice());
    }

    @Override
    public int countPrice() {
        int price = 0;
        if (electricPower <= 100) {
            price = 20000;
        } else if (electricPower <= 500) {
            price = 50000;
        } else {
            price = 150000;
        }

        if (torque <= 100) {
            price += 13000;
        } else if (torque <= 500) {
            price += 20000;
        } else {
            price += 30000;
        }

        return price;
    }
}