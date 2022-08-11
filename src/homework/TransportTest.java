package homework;

public class TransportTest {

    public static void main(String[] args) {

        Bus bus01 = new Bus("1000");
        bus01.run();
        bus01.speedUpdate(40); //속도 조절
        bus01.passengerUpdate(1); //
        bus01.statusUpdate(0);


        Taxi taxi01 = new Taxi("1652");
        taxi01.run();
        taxi01.statusUpdate(0);
        taxi01.speedUpdate(40);
        taxi01.passengerUpdate(10);

    }
}
