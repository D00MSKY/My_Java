package HW.Task_5.Task_5_2;

//- Створити масив з 20 числами.
//- за допомогою способу sorted відсортувати масив.
//        -- за допомогою filter отримати числа кратні 3
//        -- за допомогою filter отримати числа кратні 10
//        -- перебрати (проітерувати) масив за допомогою foreach()
//        -- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        Number[] numbers = {100, 400, 10, 2, 8, 1600, 451, 882, 90, 105, 110, 333, 697, 4, 11, 3000, 100500, 3, 49, 55};

        Stream<Number> stream = Arrays.stream(numbers);
        List<Number> collect = stream
                .sorted((o1, o2) -> o1.intValue() - o2.intValue())
                .collect(Collectors.toList());
                System.out.println(collect);

        Stream<Number> stream1 = Arrays.stream(numbers);
        List<Number> collect1 = stream1
                .filter(number -> number.intValue() % 3 == 0)
                .collect(Collectors.toList());
                System.out.println(collect1);

        Stream<Number> stream2 = Arrays.stream(numbers);
        List<Number> collect2 = stream2
                .filter(number -> number.intValue() % 10 == 0)
                .collect(Collectors.toList());
        System.out.println(collect2);

        Stream<Number> stream3 = Arrays.stream(numbers);
        List<Number> collect3 = stream3
                .collect(Collectors.toList());
                collect3.forEach(number -> System.out.println(number));

        Stream<Number> stream4 = Arrays.stream(numbers);
        List<Number> collect4 = stream4
                .map(number -> number.intValue() * 3)
                .collect(Collectors.toList());
        System.out.println(collect4);
    }
}

