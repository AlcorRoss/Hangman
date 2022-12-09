public class Gameplay {

    public static void gameplay() {
        int loseCounter = 0;
        int winCounter = 0;
        String word = Dictionary.wordChoice();
        String character;
        StringBuilder st = new StringBuilder("______");

        while (loseCounter <= 6) {
            character = ReadKey.readCharacter();

            if (loseCounter == 6) {
                System.out.println("Ты проиграл!");
                System.out.println("Слово: " + word);
                break;
            } else if (winCounter == word.length()) {
                System.out.println("Ты победил!");
                System.out.println("Слово: " + word);
                break;
            }

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

            System.out.println("Допущено ошибок: " + loseCounter);
            System.out.println("Отгаданные буквы: " + st.toString());
        }

    }
}
