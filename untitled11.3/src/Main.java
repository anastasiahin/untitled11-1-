import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static String sortNumbers(String[] inputArray) {
        // Створюємо список для зберігання чисел
        List<Integer> numbers = new ArrayList<>();

        // Проходимо по кожному елементу масиву
        for (String item : inputArray) {
            // Розбиваємо рядок на числа через кому
            List<String> splitItems = Arrays.asList(item.split(", "));

            // Перетворюємо рядки в числа і додаємо їх до списку
            for (String number : splitItems) {
                numbers.add(Integer.parseInt(number));
            }
        }

        // Сортуємо список чисел
        Collections.sort(numbers);

        // Перетворюємо числа назад в рядки і об'єднуємо їх через кому
        return numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[] inputArray = {"1, 2, 0", "4, 5"};
        System.out.println(sortNumbers(inputArray));
    }
}