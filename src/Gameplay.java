public class Gameplay {

    private static final String ERR_0 = "  |---|" + "\n" +
            "      |" + "\n" +
            "      |" + "\n" +
            "      |" + "\n" +
            "======|";
    private static final String ERR_1 = "  |---|" + "\n" +
            "  O   |" + "\n" +
            "      |" + "\n" +
            "      |" + "\n" +
            "======|";
    private static final String ERR_2 = "  |---|" + "\n" +
            "  O   |" + "\n" +
            " /    |" + "\n" +
            "      |" + "\n" +
            "======|";
    private static final String ERR_3 = "  |---|" + "\n" +
            "  O   |" + "\n" +
            " /|   |" + "\n" +
            "      |" + "\n" +
            "======|";
    private static final String ERR_4 = "  |---|" + "\n" +
            "  O   |" + "\n" +
            " /|\\  |" + "\n" +
            "      |" + "\n" +
            "======|";
    private static final String ERR_5 = "  |---|" + "\n" +
            "  O   |" + "\n" +
            " /|\\  |" + "\n" +
            " /    |" + "\n" +
            "======|";
    private static final String ERR_6 = "  |---|" + "\n" +
            "  O   |" + "\n" +
            " /|\\  |" + "\n" +
            " / \\  |" + "\n" +
            "======|";

    public static void gameplay() {
        int loseCounter = 0;
        int winCounter = 0;
        String word = Dictionary.wordChoice();
        String character;
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            st.append("_");
        }

        System.out.println(word);

        while (true) {

            character = ReadKey.readCharacter();

            if (word.contains(character)) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == character.charAt(0)) {
                        st.setCharAt(i, character.charAt(0));
                        winCounter++;
                    }
                }
            } else {
                loseCounter++;
            }

            switch (loseCounter) {
                case 0 -> System.out.println(ERR_0);
                case 1 -> System.out.println(ERR_1);
                case 2 -> System.out.println(ERR_2);
                case 3 -> System.out.println(ERR_3);
                case 4 -> System.out.println(ERR_4);
                case 5 -> System.out.println(ERR_5);
            }

            System.out.println("Допущено ошибок: " + loseCounter);
            System.out.println("Отгаданные буквы: " + st);

            if (loseCounter == 6) {
                System.out.println(ERR_6);
                System.out.println("Ты проиграл!");
                System.out.println("Слово: " + word);
                System.out.println("_________________________________________________" + "\n");
                break;
            } else if (winCounter == word.length()) {
                System.out.println("Ты победил!");
                System.out.println("Слово: " + word);
                System.out.println("_________________________________________________" + "\n");
                break;
            }
        }
    }
}
