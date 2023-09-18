import java.util.HashMap;
import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "привет");
        dictionary.put("world", "мир");
        dictionary.put("apple", "яблоко");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите слово на английском языке (или 'exit' для выхода):");
            String word = scanner.nextLine().toLowerCase();


            if ("exit".equals(word)) {
                System.out.println("До свидания!");
                break;
            }


            String translation = dictionary.get(word);

            if (translation != null) {

                System.out.println("Перевод: " + translation);
            } else {
                
                System.out.println("Слово не найдено в словаре. Введите перевод:");
                String newTranslation = scanner.nextLine();
                dictionary.put(word, newTranslation);
                System.out.println("Слово и его перевод сохранены в словаре.");
            }
        }

        scanner.close();
    }
}
