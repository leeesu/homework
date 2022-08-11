package homework;

public class Transport {

    public String carNo; //자동차 번호
    public int fuel; // 주유량
    public int speed; // 속도
    public int speedChange; //속도변경
    public int maxPassenger; //최대 승객 수
    public int fare; // 요금
    public boolean status; // 상태

    public Transport() {
        System.out.println("Transport constructor");
    }

    public Transport(String carNo, int fuel, int speed, int speedChange, int maxPassenger, int fare, boolean status) {
        this.carNo = carNo;
        this.fuel = fuel;
        this.speed = speed;
        this.speedChange = speedChange;
        this.maxPassenger = maxPassenger;
        this.fare = fare;
        this.status = status;
    }

    public void run(){}
    public void statusUpdate(int speed){}
    public void passengerUpdate(int passenger){}


    @Override
    public String toString() {
        return "Transport{" +
                "carNo=" + carNo +
                ", fuel=" + fuel +
                ", speed=" + speed +
                ", speedChange=" + speedChange +
                ", maxPassenger=" + maxPassenger +
                ", fare=" + fare +
                ", status='" + status + '\'' +
                '}';
    }
}



