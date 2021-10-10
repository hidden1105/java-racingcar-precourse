package racinggame;

public class CarName {
    private final static String INPUT_MESSAGE = "[ERROR] 자동차이름은쉼표(,)를 기준으로 구분하며 이름은5자이하로 입력하세요";
    private final String SEPARATOR = ",";
    private final int MAX_NAME_LEN = 5;

    private String name;

    public CarName(String input) {
        validate(input);
        name = input;
    }

    private void validate(String input) {
        if (input == null || input.equals("")) {
            throw new IllegalArgumentException(INPUT_MESSAGE);
        }

        String[] nameArray = input.split(SEPARATOR);
        for (String name : nameArray) {
            validateLen(name);
        }
    }

    private void validateLen(String name) {
        if (name.length() > MAX_NAME_LEN) {
            throw new IllegalArgumentException(INPUT_MESSAGE);
        }
    }

    public String getName() {
        return name;
    }

    public String[] getNames() {
        return name.split(SEPARATOR);
    }
}
