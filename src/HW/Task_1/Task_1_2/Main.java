package HW.Task_1.Task_1_2;

import java.util.ArrayList;
//        - створити клас, який би описував подібні об'єкти
//        https://jsonplaceholder.typicode.com/posts/1
//        створити 5 об'єктів класу, покласти в маисв/ліст, проітерувати та вивести в консоль


public class Main {
    public static void main(String[] args) {




        Post post1 = new Post(
                112,
                1,
                "Lorem ipsum dolor.",
                "Donec sit amet posuere lectus. Ut commodo risus non suscipit aliquet. Vestibulum in neque eu nulla tincidunt lobortis.");

        Post post2 = new Post(
                444,
                2,
                "Nulla volutpat erat ",
                "Etiam quis arcu sed eros accumsan tincidunt eget nec massa.");

        Post post3 = new Post(
                112,
                3,
                "Curabitur porttitor ornare sagittis",
                "Phasellus vel condimentum nibh. Nam ac diam eleifend dolor placerat faucibus. Nullam lacinia cursus lorem, quis ornare nunc molestie in");

        Post post4 = new Post(
                52,
                4,
                "Donec cursus libero",
                "Suspendisse rhoncus, urna ac viverra condimentum, nunc ante mattis magna, vitae ornare odio leo in nunc");

        Post post5 = new Post(
                10,
                5,
                "Quisque gravida",
                "Nullam a faucibus quam, ac mollis ligula");


            ArrayList<Post> posts = new ArrayList();
            posts.add(post1);
            posts.add(post2);
            posts.add(post3);
            posts.add(post4);
            posts.add(post5);

        for (Post post : posts) {
            System.out.println(post);
        }

    }
}