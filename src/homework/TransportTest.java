package homework;

import java.util.UUID;

public class TransportTest {

    public static void main(String[] args) {


        Bus bus100 = new Bus();
        bus100.setCarNo("100");
        bus100.setFuel(-40);
        bus100.run();
        bus100.passengerUpdate(30);

        Taxi taxi100 = new Taxi();
        taxi100.run();
    }
}
