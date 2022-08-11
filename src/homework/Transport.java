package homework;

public class Transport {

    protected String carNo; //자동차 번호
    protected int fuel; // 주유량
    protected int speed; // 속도
    protected int speedChange; //속도변경
    protected int maxPassenger; //최대 승객 수
    protected int fare; // 요금
    protected boolean status; //상태
    protected int passenger;
    protected int totalFare;

    public Transport(){
        System.out.println("Transport constructor");
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeedChange() {
        return speedChange;
    }

    public void setSpeedChange(int speedChange) {
        this.speedChange = speedChange;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(int totalFare) {
        this.totalFare = totalFare;
    }

    public void run() {
        if(fuel >= 10) {
            System.out.println("운행을 시작합니다.");
            status = true;
        }else {
            System.out.println("주유가 필요합니다. 현재 기름량은 "+ fuel+ "입니다.");
        }
    }

    public void passengerUpdate(int ridePassenger) {
        System.out.println("현재 승객은 "+passenger+"명 입니다");
        if(status == true && maxPassenger > passenger+ ridePassenger) {
            passenger += ridePassenger;
            totalFare = fare * ridePassenger;
        }else if(status == false) {
            System.out.println("운행 상태가 아닙니다.");
        }else if(maxPassenger < passenger + ridePassenger) {
            System.out.println("최대 승객수를 초과하여 탑승이 불가합니다.");
        }

    }
    public void speedUpdate(int change) {
        if(fuel < 10) {
            System.out.println("주유량을 확인해주세요");
        }else {
            speed += change;
            System.out.println("현재속도는 "+speed +"입니다.");
        }
    }
}



