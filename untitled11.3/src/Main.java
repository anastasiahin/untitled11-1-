import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static String sortNumbers(String[] array) {
        return Arrays.stream(array) // Створюємо потік з масиву
                .flatMap(s -> Arrays.stream(s.split(",\\s*"))) // Розбиваємо строки за комою та пробілом
                .map(Integer::parseInt) // Перетворюємо строки на числа
                .sorted() // Сортуємо числа
                .map(String::valueOf) // Перетворюємо назад на строки
                .collect(Collectors.joining(", ")); // Об'єднуємо в одну строку через кому
    }

    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        String result = sortNumbers(array);
        System.out.println(result); // Виведе: "0, 1, 2, 4, 5"
    }
}
