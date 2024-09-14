package HW.Task_1.Task_1_1;

import java.util.ArrayList;

//        Загальне: всі поля класу приватні, додати гетери сетери (не використовуючи ломбок)
//
//        - закінчити опис класів Car,Dog,Book (файли знаходяться в цій папці)
//        створити 5 об'єктів класу, покласти в маисв/ліст, проітерувати та вивести в консоль

public class Main {
    public static void main(String[] args) {


        Book book1 = new Book("The 48 Laws of Power", 452, new String[]{"Robert Greene"}, "Self-help book");
        Book book2 = new Book("Verity", 336, new String[]{"Colleen Hoover"}, "Thriller");
        Book book3 = new Book("The Very Hungry Caterpillar", 26, new String[]{"Eric Carle"}, "Children's literature");
        Book book4 = new Book("The Perfect Couple", 496, new String[]{"Elin Hilderbrand"}, "Novel");
        Book book5 = new Book("Onyx Storm", 296, new String[]{"Rebecca Yarros"}, "Fantasy");

        ArrayList<Book> books = new ArrayList();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for (Book book : books) {
            System.out.println(book);
        }


        Car car1 = new Car("Toyota Yaris", 130, 1.5, false);
        Car car2 = new Car("Renault Master", 150, 2.3, false);
        Car car3 = new Car("Hyundai Elantra", 201, 1.6, true);
        Car car4 = new Car("Mercedes Vito", 109, 2.1, false);
        Car car5 = new Car("BMW 320i Touring", 170, 2.0, false);

        ArrayList<Car> cars = new ArrayList();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        for (Car car : cars) {
            System.out.println(car);
        }

        Dog dog1 = new Dog("Лессі", 10, "Коллі");
        Dog dog2 = new Dog("Бетховен", 5, "Сенбернар");
        Dog dog3 = new Dog("Акела", 4, "Той-тер'єр");
        Dog dog4 = new Dog("Плуто", 1, "Такса");
        Dog dog5 = new Dog("Каспер", 3, "Вівчарка");

        ArrayList<Dog> dogs = new ArrayList();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}

