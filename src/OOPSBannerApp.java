import java.util.HashMap;
import java.util.Map;

class BannerCharacter {
    private String[] pattern;

    public BannerCharacter(String[] pattern) {
        this.pattern = pattern;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class OOPSBannerApp {
    public static Map<Character, BannerCharacter> buildCharacterMap() {
        Map<Character, BannerCharacter> charMap = new HashMap<>();

        charMap.put('O', new BannerCharacter(new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        }));

        charMap.put('P', new BannerCharacter(new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        }));

        charMap.put('S', new BannerCharacter(new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        }));

        return charMap;
    }

    public static void renderBanner(String message, Map<Character, BannerCharacter> charMap) {
       
        int height = charMap.get(message.charAt(0)).getPattern().length;

        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                BannerCharacter bc = charMap.get(ch);
                if (bc != null) {
                    line.append(bc.getPattern()[row]).append("  "); // spacing between letters
                }
            }
            System.out.println(line.toString());
        }
    }
    public static void main(String[] args) {
        Map<Character, BannerCharacter> charMap = buildCharacterMap();
        String message = "OOPS";
        renderBanner(message, charMap);
    }
}