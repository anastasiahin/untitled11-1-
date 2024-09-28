import java.util.List;
import java.util.ArrayList;

public class Main {
    public static String oddIndexedNames(List<String> names) {
        StringBuilder result = new StringBuilder();

        // Проходимо по списку імен
        for (int i = 0; i < names.size(); i++) {
            // Перевіряємо чи індекс непарний (позиції 1, 3, 5 і т.д.)
            if (i % 2 == 0) {  // індекс i є парним, а позиція (i+1) — непарною
                result.append(i + 1).append(". ").append(names.get(i)).append(", ");
            }
        }

        // Видаляємо останню кому і пробіл
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Використовуємо ArrayList для створення змінного списку
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("John");
        names.add("Peter");
        names.add("Alice");
        names.add("Mike");

        System.out.println(oddIndexedNames(names));
    }
}
