import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Pattern pattern = Pattern.compile("[а-яёА-ЯЁ]+");
        Scanner scanner = new Scanner(System.in);
        String line;

        System.out.println("Введите букву");

        while (true) {
            line = scanner.next();
            Matcher matcher = pattern.matcher(line);

            if (line.length() != 1 || !matcher.find()) {
                System.out.println("Некорректный ввод, попробуйте снова");
            } else {
                line = line.toLowerCase();
                break;
            }
        }

        return line;
    }
}
