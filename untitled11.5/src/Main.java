import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.Spliterator;
import java.util.Spliterators;

public class Main {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        // Створюємо ітератори для обох стрімів
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        // Створюємо ітерований стрім, який буде брати елементи попарно з двох стрімів
        Iterator<T> zippedIterator = new Iterator<T>() {
            private boolean switcher = true; // Перемикач для чергування стрімів

            @Override
            public boolean hasNext() {
                return firstIterator.hasNext() && secondIterator.hasNext();
            }

            @Override
            public T next() {
                // Перемикаємо між стрімами
                if (switcher) {
                    switcher = false;
                    return firstIterator.next();
                } else {
                    switcher = true;
                    return secondIterator.next();
                }
            }
        };

        // Перетворюємо ітератор назад у стрім
        Spliterator<T> spliterator = Spliterators.spliteratorUnknownSize(zippedIterator, Spliterator.ORDERED);
        return StreamSupport.stream(spliterator, false);
    }

    public static void main(String[] args) {
        // Приклад двох стрімів
        Stream<String> firstStream = Stream.of("A", "B", "C");
        Stream<String> secondStream = Stream.of("1", "2", "3", "4");

        // Викликаємо zip і виводимо результат
        zip(firstStream, secondStream)
                .forEach(System.out::println); // Очікуваний результат: A 1 B 2 C 3
    }
}