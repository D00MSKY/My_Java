package HW.Task_4.Task_4_4;

import java.util.List;

public class Person implements Comparable<Person>{
    private int id;
    private String name;


    public Person() {
    }

    public Person(int id, String name, List<Pet> pets) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.id - o.id;
    }
}
