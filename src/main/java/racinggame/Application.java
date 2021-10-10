package racinggame;

import nextstep.utils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할자동차이름을입력하세요.(이름은쉼표(,)기준으로구분)");
        CarName carName = new CarName(Console.readLine());
        System.out.println("시도할 회수는 몇회인가요?");
        RaceCount raceCount = new RaceCount(Console.readLine());

        System.out.println("실행 결과");
        Race race = new Race(Race.generateCars(carName), raceCount);
        race.play();
        ResultView.viewWinners(Winner.getWinners(race.getCars()));
    }
}
