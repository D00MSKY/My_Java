package HW.Task_1.Task_1_3;

import java.util.ArrayList;

//        - створити клас, який би описував подібні об'єкти
//        https://jsonplaceholder.typicode.com/comments/1
//        створити 5 об'єктів класу, покласти в маисв/ліст, проітерувати та вивести в консоль

public class Main {
    public static void main(String[] args) {


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