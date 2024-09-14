package HW.Task_2.Task_2_2;

public class PC {

    private int CPUs;
    private int RAM;
    private double monitorSize;

    public PC() {
    }

    public PC(int CPUs, int RAM, double monitorSize) {
        this.CPUs = CPUs;
        this.RAM = RAM;
        this.monitorSize = monitorSize;
    }

    public int getCPUs() {
        return CPUs;
    }

    public void setCPUs(int CPUs) {
        this.CPUs = CPUs;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getMonitorSize() {
        return monitorSize;
    }

    public void setMonitorSize(double monitorSize) {
        this.monitorSize = monitorSize;
    }

    @Override
    public String toString() {
        return "PC{" +
                "CPUs=" + CPUs +
                ", RAM=" + RAM +
                ", monitorSize=" + monitorSize +
                '}';
    }
}
