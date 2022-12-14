import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dictionary {
    private final static List<String> dictionary = new ArrayList<>();

    public static void readDictionary() {
        String line;

        try (BufferedReader bufReader = new BufferedReader(new FileReader("Dictionary.txt"), 1384448)) {
            while ((line = bufReader.readLine()) != null) {
                dictionary.add(line);
            }
        } catch (IOException e) {
            System.out.println("Не удалось получить словарь");
            System.out.println(e.getMessage());
        }
    }

    public static String wordChoice() {
        Random r = new Random();

        if (dictionary.isEmpty()) readDictionary();

        return dictionary.get(r.nextInt(0, dictionary.size()));
    }
}
