import java.util.Scanner;

public class ReadKey {
    private static int choice;

    public static int readMenu() {
        Scanner scanner = new Scanner(System.in);

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
}
