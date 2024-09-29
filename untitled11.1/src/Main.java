import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static String oddIndexedNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0) // Відбираємо парні індекси
                .mapToObj(i -> (i + 1) + ". " + names.get(i)) // Форматування рядка
                .collect(Collectors.joining(", ")); // Об’єднуємо в один рядок
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("John");
        names.add("Peter");
        names.add("Alice");
        names.add("Mike");

        System.out.println(oddIndexedNames(names));
    }
}
