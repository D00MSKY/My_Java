package HW.Task_2.Task_2_2;

public class Workstation extends Laptop{

    private String GPU;

    public Workstation(int CPUs, int RAM, double monitorSize, double weight, int batteryCapacity, String GPU) {
        super(CPUs, RAM, monitorSize, weight, batteryCapacity);
        this.GPU = GPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "GPU='" + GPU + '\'' +
                "} " + super.toString();
    }
}
