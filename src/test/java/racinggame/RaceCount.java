package racinggame;

public class RaceCount {
    private final static String INPUT_MESSAGE = "정수만 입력해주세요";

    private int gameCount;

    public RaceCount(String input) {
        gameCount = Integer.parseInt(input);
    }

    public int getGameCount() {
        return gameCount;
    }
}
