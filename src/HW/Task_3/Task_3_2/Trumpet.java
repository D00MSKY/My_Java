package HW.Task_3.Task_3_2;

public class Trumpet implements Instrument{

    private double diameter;

    public Trumpet() {
    }

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diameter=" + diameter +
                '}';
    }

    @Override
    public void play() {
        System.out.println("The trumpet with " + this.diameter + " diameter is playing");
    }
}
