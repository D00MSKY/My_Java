package HW.Task_5.Task_5_3;

public class Car {
    private String model;
    private int power;
    private Driver driver;
    private int price;
    private int year;

    public Car() {
    }

    public Car(String model, int power, Driver driver, int price, int year) {
        this.model = model;
        this.power = power;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", driver=" + driver +
                ", price=" + price +
                ", year=" + year +
                '}';
    }


}
