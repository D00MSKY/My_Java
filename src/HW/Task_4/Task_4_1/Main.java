package HW.Task_4.Task_4_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Створити List Юзерів
//- відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
//- відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
       users.add(new User("Andriy", 20));
       users.add(new User("Anatoliy", 25));
       users.add(new User("Sonya", 30));

        users.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(users);

        users.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        System.out.println(users);

        users.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        System.out.println(users);

        users.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o2.getName().length() - o1.getName().length();
            }
        });
        System.out.println(users);
    }
}
