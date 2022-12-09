import java.util.Scanner;

public class ReadKey {

    public static int readMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод, попробуйте снова");
                scanner.next();
            }
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    return 1;
                }
                case 2 -> {
                    return 2;
                }
                default -> System.out.println("Некорректный ввод, попробуйте снова");
            }
        }
    }

    public static char readChar() {
        Scanner scanner = new Scanner(System.in);
        char c;

        System.out.println("Введите букву");

        while (true) {
            String line = scanner.next();
            if (line.length() != 1) {
                System.out.println("Некорректный ввод, попробуйте снова");
            } else {
                c = line.toLowerCase().charAt(0);
                break;
            }
        }

        return c;
    }
}
