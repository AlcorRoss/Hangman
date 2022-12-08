public class Gameplay {

    public static void gameplay() {
        int counter = 0;
        String word = Dictionary.wordChoice();

        while (counter <= 6) {

            if(counter==6){
                System.out.println("Ты проиграл!");
            }

            System.out.println("Допущено ошибок: " + counter);

        }

    }
}
