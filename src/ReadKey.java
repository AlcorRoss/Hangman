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

    public static String readCharacter() {
        Scanner scanner = new Scanner(System.in);
        String line;

        System.out.println("Введите букву");

        while (true) {
            line = scanner.next();
            if (line.length() != 1) {
                System.out.println("Некорректный ввод, попробуйте снова");
            } else {
                line = line.toLowerCase();
                break;
            }
        }

        return line;
    }
}
