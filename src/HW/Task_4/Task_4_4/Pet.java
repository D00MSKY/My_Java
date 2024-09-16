package HW.Task_4.Task_4_4;

public class Pet {
    private String animal;
    private String name;
    private int age;

    public Pet() {
    }

    public Pet(String animal, String name, int age) {
        this.animal = animal;
        this.name = name;
        this.age = age;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "animal='" + animal + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
