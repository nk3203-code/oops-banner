public class InnerClass {

    static class Innerclass {
        private char character;
        private String[] pattern;

        public Innerclass(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static Innerclass[] buildCharacterPatterns() {
        Innerclass O = new Innerclass('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        Innerclass P = new Innerclass('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });

        Innerclass S = new Innerclass('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });

        return new Innerclass[]{O, P, S};
    }

    public static String[] getCharacterPattern(char ch, Innerclass[] patterns) {
        for (Innerclass cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return null;
    }

    public static void renderBanner(String message, Innerclass[] patterns) {
        int height = patterns[0].getPattern().length;
        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, patterns);
                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        Innerclass[] patterns = buildCharacterPatterns();
        String message = "OOPS";
        renderBanner(message, patterns);
    }
}