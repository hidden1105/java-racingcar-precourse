package racinggame;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Car> cars;
    private RaceCount raceCount;

    public Race(List<Car> cars, RaceCount raceCount) {
        this.cars = cars;
        this.raceCount = raceCount;
    }

    public static List<Car> generateCars(CarName carName) {
        List<String> names = carName.getNames();
        List<Car> list = new ArrayList<>();
        for (String name :names) {
            list.add(new Car(name));
        }
        return list;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void play() {
        for (int i = 0; i < raceCount.getGameCount(); i++) {
            cars.forEach((car -> car.move(new MoveNumber(Randoms.pickNumberInRange(0, 9)))));
            ResultView.view(cars);
        }
    }
}
