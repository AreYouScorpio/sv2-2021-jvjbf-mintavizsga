package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> getUniqueChars(String charlist) {
        List<Character> result = new ArrayList<>();
        if (charlist == null) throw new IllegalArgumentException("Text is null.");
        else {
            char[] chars = charlist.toCharArray();
            for (int i = 0; i < chars.length; i++)
                if (result.indexOf(chars[i]) < 0) {
                    result.add(chars[i]);

                }
        }
        return result;
    }
}

