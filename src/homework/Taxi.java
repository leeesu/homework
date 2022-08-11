package homework;

import java.util.UUID;

public class Taxi extends Transport {

    private String destination;
    private int defaultDist;
    private int targetDist;
    private int distFare;
    private int passenger;
    private int totalFare;

    public Taxi(String carNo, int fuel, int speed, int speedChange, int maxPassenger,
                int fare, boolean status, String destination, int defaultDist, int targetDist,
                int distFare, int totalFare) {
        super(carNo, fuel, speed, speedChange, maxPassenger, fare, status);
        this.destination = destination;
        this.defaultDist = defaultDist;
        this.targetDist = targetDist;
        this.distFare = distFare;
        this.carNo = UUID.randomUUID().toString();
        this.fare = fare;
        this.fuel = 100;
        this.speed = speed;
        this.maxPassenger = 4;
        this.passenger = passenger;
        this.totalFare = totalFare;

    }

    public Taxi(String carNo) {
        this.carNo = carNo;
    }


    @Override
    public void run() {
        if (this.fuel < 10) {
            System.out.println("주유가 필요합니다.");
            this.status = false;
        } else {
            System.out.println("운행을 시작합니다.");
            this.status = true;
        }
    }

    @Override
    public void passengerUpdate(int passenger) {
        this.maxPassenger += passenger;
        this.fare += 3000;
    }

    public void speedUpdate(int speed) {
        this.speed = speed;
        if (this.speed == 0) {
            System.out.println("운행중이 아닙니다.");
        } else if (this.speed < speed) {
            System.out.println("속도를 가속합니다 현재속도는" + speed + "입니다.");
            ;
        } else if (this.speed > speed) {
            System.out.println("속드를 감속합니다 현재속도는" + speed + "입니다.");
        }
    }


    public int payment(int fare) {
        if (this.targetDist > this.defaultDist) {
            totalFare = this.fare + fare;
        } else {
            totalFare = this.fare;
        }
        return totalFare;
    }
}
