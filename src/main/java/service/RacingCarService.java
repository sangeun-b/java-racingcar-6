package service;
import domain.Car;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RacingCarService {

    public int generateRandomNumber() {
        int randomNumber = pickNumberInRange(1,9);
        return randomNumber;
    }

    public void move(Car car, int randomNumber) {
        int position = car.getPosition();
        car.setPosition(position+randomNumber);
    }
}
