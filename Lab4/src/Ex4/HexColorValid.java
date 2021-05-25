package Ex4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorValid {
    private Pattern pattern;
    private Matcher matcher;
    private static final String HEX_PATTERN = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";

    public HexColorValid() {
        pattern = Pattern.compile(HEX_PATTERN);
    }

    public boolean validate(final String hexColorCode) {

        matcher = pattern.matcher(hexColorCode);
        return matcher.matches();
    }

}

