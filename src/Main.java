import HW.Task_1.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


//        Загальне: всі поля класу приватні, додати гетери сетери (не використовуючи ломбок)
//
//        - закінчити опис класів Car,Dog,Book (файли знаходяться в цій папці)
//        створити 5 об'єктів класу, покласти в маисв/ліст, проітерувати та вивести в консоль


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

//        - створити клас, який би описував подібні об'єкти
//        https://jsonplaceholder.typicode.com/posts/1
//        створити 5 об'єктів класу, покласти в маисв/ліст, проітерувати та вивести в консоль

        User user1 = new User(
                1,
                1,
                "Lorem ipsum dolor.",
                "Donec sit amet posuere lectus. Ut commodo risus non suscipit aliquet. Vestibulum in neque eu nulla tincidunt lobortis.");

        User user2 = new User(
                2,
                2,
                "Nulla volutpat erat ",
                "Etiam quis arcu sed eros accumsan tincidunt eget nec massa.");

        User user3 = new User(
                3,
                3,
                "Curabitur porttitor ornare sagittis",
                "Phasellus vel condimentum nibh. Nam ac diam eleifend dolor placerat faucibus. Nullam lacinia cursus lorem, quis ornare nunc molestie in");

        User user4 = new User(
                4,
                4,
                "Donec cursus libero",
                "Suspendisse rhoncus, urna ac viverra condimentum, nunc ante mattis magna, vitae ornare odio leo in nunc");

        User user5 = new User(
                5,
                5,
                "Quisque gravida",
                "Nullam a faucibus quam, ac mollis ligula");


            ArrayList<User> users = new ArrayList();
            users.add(user1);
            users.add(user2);
            users.add(user3);
            users.add(user4);
            users.add(user5);

        for (User user : users) {
            System.out.println(user);
        }
//        - створити клас, який би описував подібні об'єкти
//        https://jsonplaceholder.typicode.com/comments/1
//        створити 5 об'єктів класу, покласти в маисв/ліст, проітерувати та вивести в консоль

        Comment comment1 = new Comment(
                123,
                1,
                "Lorem ipsum",
                "123@gmail.com",
                "Mo;rbi in eros vel nunc suscipit dapibus");

        Comment comment2 = new Comment(
                234,
                2,
                "Nulla aliquam",
                "222@gmail.com",
                "Praesent lectus mauris, vestibulum eu diam");

        Comment comment3 = new Comment(
                345,
                3,
                "Vivamus pretium",
                "van@gmail.com",
                "Maecenas rutrum rutrum metus");

        Comment comment4 = new Comment(
                456,
                4,
                "Donec sit",
                "Dim111@gmail.com",
                "Morbi vehicula maximus risus, nec tincidunt risus facilisis in");
        Comment comment5 = new Comment(
                567,
                5,
                "Nulla volutpat",
                "quik@gmail.com",
                "Etiam quis arcu sed eros accumsan tincidunt eget nec massa");

            ArrayList<Comment> comments = new ArrayList();
            comments.add(comment1);
            comments.add(comment2);
            comments.add(comment3);
            comments.add(comment4);
            comments.add(comment5);

        for (Comment comment : comments) {
            System.out.println(comment);
        }




    }
}