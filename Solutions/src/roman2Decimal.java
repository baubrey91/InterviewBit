

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class roman2Decimal {
    private static double evaluateNextRomanNumeral(String roman, int pos, double rightNumeral) {
        if (pos < 0) return 0;
        char ch = roman.charAt(pos);
        double value = Math.floor(Math.pow(10, "IXCM".indexOf(ch))) + 5 * Math.floor(Math.pow(10, "VLD".indexOf(ch)));
        return value * Math.signum(value + 0.5 - rightNumeral) + evaluateNextRomanNumeral(roman, pos - 1, value);
    }

    public static int romanToInt(String s) {
        if (s == null || s.isEmpty() || !s.matches("^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"))
            return -1;
        return (int) evaluateNextRomanNumeral(s, s.length() - 1, 0);
    }
}
