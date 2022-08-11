package homework;

import java.util.UUID;

public class Taxi extends Transport {

    private String destination;
    private int defaultDist;
    private int targetDist;
    private int distFare;
    private int passenger;
    private int totalFare;

    public Taxi() {
        maxPassenger = 4;
        fare = 3000;
        distFare = 1000;
        defaultDist = 1;
        fuel = 100;
        status = true;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDefaultDist() {
        return defaultDist;
    }

    public void setDefaultDist(int defaultDist) {
        this.defaultDist = defaultDist;
    }

    public int getTargetDist() {
        return targetDist;
    }

    public void setTargetDist(int targetDist) {
        this.targetDist = targetDist;
    }

    public int getDistFare() {
        return distFare;
    }

    public void setDistFare(int distFare) {
        this.distFare = distFare;
    }


}