package HW.Task_3.Task_3_1;

public class Book implements Printable{

        private String title;
        private String Author;


    @Override
    public void print() {

    }

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        Author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }
}
