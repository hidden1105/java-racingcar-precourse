package racinggame;

import java.util.ArrayList;
import java.util.List;

public class Winner {
    public static List<String> getWinners(List<Car> cars) {
        int position = getWinnersPosition(cars);
        return getWinners(cars, position);
    }

    private static int getWinnersPosition(List<Car> cars) {
        int winnerPosition = 0;
        for (Car car : cars) {
            if (car.getPosition() > winnerPosition) {
                winnerPosition = car.getPosition();
            }
        }
        return winnerPosition;
    }

    private static List<String> getWinners(List<Car> cars, int position) {
        List<String> list = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == position) {
                list.add(car.getName());
            }
        }
        return list;
    }
}
