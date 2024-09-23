package HW.Task_5.Task_5_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//створити ArrayList зі словами на 15-20 елементів.
//- відсортувати його за алфавітом .
//        *-- відфільтрувати слова довжиною менше 4 символів

public class Main {
    public static void main(String[] args) {

        ArrayList<HW.Task_5.Task_5_1.Word> words = new ArrayList<>();
        words.add(new HW.Task_5.Task_5_1.Word("lorem"));
        words.add(new HW.Task_5.Task_5_1.Word("ipsum"));
        words.add(new HW.Task_5.Task_5_1.Word("dolor"));
        words.add(new HW.Task_5.Task_5_1.Word("sit"));
        words.add(new HW.Task_5.Task_5_1.Word("amet"));
        words.add(new HW.Task_5.Task_5_1.Word("consectetur"));
        words.add(new HW.Task_5.Task_5_1.Word("adipiscing"));
        words.add(new HW.Task_5.Task_5_1.Word("elit"));
        words.add(new HW.Task_5.Task_5_1.Word("duis"));
        words.add(new HW.Task_5.Task_5_1.Word("condimentum"));
        words.add(new HW.Task_5.Task_5_1.Word("sed"));
        words.add(new HW.Task_5.Task_5_1.Word("metus"));
        words.add(new HW.Task_5.Task_5_1.Word("in"));
        words.add(new HW.Task_5.Task_5_1.Word("tincidunt"));
        words.add(new HW.Task_5.Task_5_1.Word("nam"));
        words.add(new HW.Task_5.Task_5_1.Word("vulputate"));
        words.add(new HW.Task_5.Task_5_1.Word("felis"));
        words.add(new HW.Task_5.Task_5_1.Word("quam"));
        words.add(new HW.Task_5.Task_5_1.Word("nec"));
        words.add(new HW.Task_5.Task_5_1.Word("finibus"));

        Stream<HW.Task_5.Task_5_1.Word> stream = words.stream();
        List<Object> collect = stream
                .sorted((o1, o2) -> o1.getWord().compareTo(o2.getWord()))
                .filter(word -> word.getWord().length() < 4)
                .collect(Collectors.toList());

        System.out.println(collect);


    };

    }

