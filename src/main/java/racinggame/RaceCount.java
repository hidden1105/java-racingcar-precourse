package racinggame;

public class RaceCount {
    private int gameCount;

    public RaceCount(String input) {
        gameCount = Integer.parseInt(input);
    }

    public int getGameCount() {
        return gameCount;
    }
}
