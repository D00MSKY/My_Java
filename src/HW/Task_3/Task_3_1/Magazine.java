package HW.Task_3.Task_3_1;

public class Magazine implements Printable {

    private String title;


    @Override
    public void print() {

    }

    public Magazine() {
    }

    public Magazine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                '}';
    }
}
