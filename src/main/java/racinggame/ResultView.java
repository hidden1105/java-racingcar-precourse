package racinggame;

import java.util.List;

public class ResultView {
    private static final String POSITION = "-";

    public static void view(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + ":" + getPositionView(car.getPosition()));
        }
        System.out.println();
    }

    private static String getPositionView(int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append(POSITION);
        }
        return sb.toString();
    }
}
