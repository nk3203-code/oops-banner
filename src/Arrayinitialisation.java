public class Arrayinitialisation {
    public static void main(String[] args) {
        System.out.println("OOPS Banner App - UC5");

        // Inline array initialization with String.join()
        String[] bannerLines = {
            String.join("", "   ***      ", "     ***     ", "  ******      ", "   ******   "),
            String.join("", " **   **    ", "   **   **   ", "  **    **    ", " **         "),
            String.join("", "**     **   ", "  **     **  ", "  **     **   ", " **         "),
            String.join("", "**     **   ", "  **     **  ", "  **    **    ", "   **       "),
            String.join("", "**     **   ", "  **     **  ", "  ******      ", "     ***    "),
            String.join("", "**     **   ", "  **     **  ", "  **          ", "        **  "),
            String.join("", "**     **   ", "  **     **  ", "  **          ", "         ** "),
            String.join("", " **   **    ", "   **   **   ", "  **          ", "        **  "),
            String.join("", "   ***      ", "     ***     ", "  **          ", "   ******   ")
        };
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}