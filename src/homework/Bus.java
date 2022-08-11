package homework;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.UUID;

public class Bus extends Transport{

    public Bus() {
        fuel = 100;
        speed = 0;
        status = true;
        maxPassenger = 30;
        fare = 1000;
        passenger = 5;
    }

    public String showBus() {
        return carNo + "번 버스의 속도는" + speed+
                "이며 현재 승객의 수는 "+passenger+"명 입니다. 운행 시작 후 승객의 " +
                "탑승으로 누적된 전체 요금은" + totalFare+ "입니다";
    }
}
