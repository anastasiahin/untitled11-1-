import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static List<String> sortAndUppercase(List<String> names) {
        // Збираємо результати у новий список
        List<String> result = new ArrayList<>();

        names.stream()
                .map(String::toUpperCase) // Перетворюємо на верхній регістр
                .sorted(Comparator.reverseOrder()) // Сортуємо за спаданням
                .forEach(result::add); // Додаємо кожен елемент у новий список

        return result;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("John");
        names.add("Peter");
        names.add("Alice");
        names.add("Mike");

        System.out.println(sortAndUppercase(names));
    }
}
