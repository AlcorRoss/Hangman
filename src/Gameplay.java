public class Gameplay {

    public static void gameplay() {
        int counter = 0;
        String word = Dictionary.wordChoice();
        StringBuilder st = new StringBuilder("______");

        while (counter <= 6) {
            System.out.println("");

            if(counter==6){
                System.out.println("Ты проиграл!");
                System.out.println("Слово: " + word);
                break;
            }

            System.out.println("Допущено ошибок: " + counter);

        }

    }
}
