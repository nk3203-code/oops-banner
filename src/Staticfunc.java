public class Staticfunc {

    public static String[] getOPattern() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {
        String[][] banner = {
            getOPattern(),
            getOPattern(),
            getPPattern(),
            getSPattern()
        };

        int height = banner[0].length;
        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();
            for (String[] letter : banner) {
                line.append(letter[row]).append("  ");
            }
            System.out.println(line.toString());
        }
    }
}


