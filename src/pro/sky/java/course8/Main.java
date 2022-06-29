package pro.sky.java.course8;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
// Дан массив строк, необходимо удалить из него все дубли,
// оставшиеся строки объединить в одну в порядке следования в массиве.

        String[] array = {"You", "you", "you", "you", "you", "didn't", "even", "try", "and",
                "you", "you", "you", "you", "you", "didn't", "tell", "me", "why"};

        String result = Arrays.stream(array).map(s -> s.toLowerCase(Locale.ROOT)).distinct()
                .collect(Collectors.joining(" "));

        System.out.println(Arrays.toString(array));
        System.out.println(result);

    }
}
