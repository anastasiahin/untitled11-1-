import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static List<String> sortAndUppercase(List<String> names) {
        // Створюємо новий список, щоб не змінювати оригінальний
        List<String> uppercasedNames = new ArrayList<>();

        // Перетворюємо кожен рядок на верхній регістр
        for (String name : names) {
            uppercasedNames.add(name.toUpperCase());
        }

        // Сортуємо список за спаданням
        Collections.sort(uppercasedNames, Collections.reverseOrder());

        return uppercasedNames;
    }

    public static void main(String[] args) {
        // Використовуємо ArrayList для створення списку
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("John");
        names.add("Peter");
        names.add("Alice");
        names.add("Mike");

        System.out.println(sortAndUppercase(names));
    }
}
