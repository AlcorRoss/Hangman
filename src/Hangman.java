public class Hangman {
    public static void main(String[] args) {
        int choice;

        while (true) {
            System.out.println("1 - Новая игра");
            System.out.println("2 - Выход");

            choice = ReadKey.readMenu();

            if (choice == 2) {
                break;
            } else if (choice == 1) {
                System.out.println(Dictionary.wordChoice());
            }
        }
    }
}
