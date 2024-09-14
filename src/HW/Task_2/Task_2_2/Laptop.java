package HW.Task_2.Task_2_2;

public class Laptop extends PC {

    private double weight;
    private int batteryCapacity;



    public Laptop(int CPUs, int RAM, double monitorSize, double weight, int batteryCapacity) {
        super(CPUs, RAM, monitorSize);
        this.weight = weight;
        this.batteryCapacity = batteryCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight +
                ", batteryCapacity=" + batteryCapacity +
                "} " + super.toString();
    }
}

