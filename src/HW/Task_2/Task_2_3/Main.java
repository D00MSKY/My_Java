package HW.Task_2.Task_2_3;

//Cтворити клас ланцюг наслідування:
//Папірус-Кинга-Журнал
//Папірус-Книга-Комікс
//Кількість полів довільна.

public class Main {
    public static void main(String[] args) {

        Papyrus papyrus = new Papyrus(5000);
        Book book = new Book(1200, 400);
        Magazine magazine = new Magazine(450, 50, 10);
        Comics comics = new Comics(800, 48, 74);

        System.out.println(papyrus);
        System.out.println(book);
        System.out.println(magazine);
        System.out.println(comics);

    }
}
