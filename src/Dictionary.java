import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Dictionary {
    private static String[] dictionary;

    public static void readDictionary() {
        String line;
        ArrayList<String> temp = new ArrayList<>();

        try (BufferedReader bufReader = new BufferedReader(new FileReader("Dictionary.txt"), 1384448)) {
            while ((line = bufReader.readLine()) != null) {
                temp.add(line);
            }
        } catch (IOException e) {
            System.out.println("Не удалось получить словарь");
            System.out.println(e.getMessage());
        }
        temp.toArray(dictionary);
    }

    public static String wordChoice() {
        Random r = new Random();

        if (dictionary == null) readDictionary();

        return dictionary[r.nextInt(0, dictionary.length)];
    }
}
