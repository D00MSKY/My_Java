package HW.Task_2.Task_2_2;

public class Ultrabook extends Laptop{

    private double thickness;

    public Ultrabook(int CPUs, int RAM, double monitorSize, double weight, int batteryCapacity, double thickness) {
        super(CPUs, RAM, monitorSize, weight, batteryCapacity);
        this.thickness = thickness;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "thickness=" + thickness +
                "} " + super.toString();
    }
}
