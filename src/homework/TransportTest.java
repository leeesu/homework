package homework;

public class TransportTest {

    public static void main(String[] args) {

        Bus bus01 = new Bus("1000");
        bus01.run();
        bus01.speedUpdate(40); //속도 조절
        bus01.passengerUpdate(20); //
        bus01.statusUpdate(0);
    }
}
