import java.util.regex.Pattern;

public class Main {
    public static final String ONLY_DIGITS_REGEX = "\\d+$";
    public static final String LOG_FORMAT = "This input %s only digits";
    public static final String IS = "is";
    public static final String IS_NOT = "is not";

    public static void main(String[] args) {
        String input = "123456";
        System.out.printf((LOG_FORMAT), isOnlyDigits(input) ? IS : IS_NOT);
    }

    public static boolean isOnlyDigits(String input) {
        return Pattern.matches(ONLY_DIGITS_REGEX, input);
    }
}