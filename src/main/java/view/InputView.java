package view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {

    public static final String INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String INPUT_TRY_TIME = "시도할 회수는 몇회인가요?";

    public List<String> inputCarName() {
        System.out.println(INPUT_CAR_NAME);
        String carName = Console.readLine();
        List<String> carNames = Arrays.asList(carName.split(","));
        return carNames;
    }
    public int inputTryTime() {
        System.out.println(INPUT_TRY_TIME);
        int tryTime = Integer.parseInt(Console.readLine());
        return tryTime;
    }
}
