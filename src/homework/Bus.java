package homework;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.UUID;

public class Bus extends Transport{
    private int passenger;

    public Bus(String carNo, int fuel, int speed, int speedChange, int maxPassenger, int fare,
               boolean status, int passenger) {
        super(carNo, fuel, speed, speedChange, maxPassenger, fare, status);
        this.passenger = 0; //현재승객
        this.maxPassenger = 30;
        this.status = true;
        this.fuel = 100;
        this.speed = speed;
        this.carNo = carNo;


    }

    public Bus(String carNo) {
        System.out.println(carNo+"번 버스가 운행을 준비합니다.");
        this.carNo = carNo;
    }

    @Override
    public void run() {
        if(fuel < 10) {
            System.out.println("주유가 필요합니다.");
            status = false;
        }else {
            System.out.println("운행을 시작합니다.");
            status = true;
        }
    }

    @Override
    public void statusUpdate(int speed) {
        if(fuel < 10) {
            System.out.println("차고지로 이동합니다.");
            System.out.println("주유가 필요합니다.");
            status = false;
        }else {
            System.out.println("운행을 시작합니다.");
            status = true;

        }
    }

    @Override
    public void passengerUpdate(int passenger) {

        if(this.status = true && this.passenger + passenger < this.maxPassenger) {
            //탑승객이 maxPassenger보다 작을때
            this.passenger += passenger;
            this.fare += 1000*passenger;
            System.out.println("현재 승객은" +this.passenger+"입니다.");;
        }else if(this.status = true && this.passenger + passenger > this.maxPassenger) {
            this.passenger = 30;
            this.maxPassenger = 30;
            System.out.println("최대 승객 " + this.maxPassenger + "명을 초과하여 더이상의 승객을 태우는 것이 불가능합니다.");
        }else if(status == false) {
            System.out.println("차고지로 이동합니다.");

        }
    }
    public void speedUpdate(int speed) {
        this.speed = speed;
        if(this.speed == 0) {
            System.out.println("운행중이 아닙니다.");
        }else if(this.speed < speed) {
            System.out.println("속도를 가속합니다 현재속도는"+speed+"입니다.");;
        }else if(this.speed > speed) {
            System.out.println("속도를 감속합니다 현재속도는"+speed+"입니다.");
        }
    }
}
