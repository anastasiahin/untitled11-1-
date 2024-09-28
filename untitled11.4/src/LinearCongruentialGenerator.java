import java.util.stream.Stream;

public class LinearCongruentialGenerator {

    public static Stream<Long> randomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static void main(String[] args) {
        // Параметри генератора
        long a = 25214903917L;
        long c = 11L;
        long m = (1L << 48);  // m = 2^48

        // Початковий seed
        long seed = System.currentTimeMillis();  // або можна вибрати будь-яке інше число

        // Створюємо потік випадкових чисел
        Stream<Long> randomNumbers = randomStream(seed, a, c, m);

        // Виводимо перші 10 випадкових чисел
        randomNumbers.limit(10).forEach(System.out::println);
    }
}
