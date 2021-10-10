package racinggame;

public class MoveNumber {
    private static final int MIN_MOVE_NUMBER = 0;
    private static final int MAX_MOVE_NUMBER = 9;
    private static final int MOVE_ABLE_NUMBER = 4;
    private int number;

    public MoveNumber(int number) {
        if (number < MIN_MOVE_NUMBER || number > MAX_MOVE_NUMBER) {
            throw new IllegalArgumentException();
        }
        this.number = number;
    }

    public boolean isMoveAble() {
        return number >= MOVE_ABLE_NUMBER;
    }
}
