package car;

public class HybridCar extends Car {
    public HybridCar(String model, int enginePower, int torque) {
        super(model, enginePower, torque);
    }

    @Override
    public void showInfo() {
        System.out.printf("%nМодель: %s%nМощность двигателя: %d Н%nКрутящий момент: %d Н%nЦена: %d $%n",model,enginePower,torque,countPrice());
    }

    @Override
    public int countPrice() {
        int price = 0;
        if (enginePower <= 100) {
            price = 10000;
        } else if (enginePower <= 500) {
            price = 30000;
        } else {
            price = 100000;
        }

        if (torque <= 100) {
            price += 3000;
        } else if (torque <= 500) {
            price += 10000;
        } else {
            price += 20000;
        }

        return price;
    }
}