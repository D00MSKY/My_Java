package HW.Task_3.Task_3_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Guitar(7));
        instruments.add(new Drum(50));
        instruments.add(new Trumpet(20));

        for (Instrument instrument : instruments) {
            instrument.play();
        }

    }
}
