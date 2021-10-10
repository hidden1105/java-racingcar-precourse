package racinggame;

public class CarName {
    private final static String INPUT_MESSAGE = "자동차이름은쉼표(,)를 기준으로 구분하며 이름은5자이하로 입력하세요";
    private final String SEPARATOR = ",";

    private String names;

    public CarName(String input) {
        if (input == null || input.equals("")) {
            throw new IllegalArgumentException(INPUT_MESSAGE);
        }
        names = input;
    }

    public String getNames() {
        return names;
    }
}
