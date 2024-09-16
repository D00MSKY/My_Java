package HW.Task_4.Task_4_4;

import java.util.ArrayList;

//Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
//В зооклубі створити методи, та застосувати їх
//1) додати учасника в клуб;
//2) додати тваринку до учасника клубу.
//3) видалити тваринку з власника.
//        4) видалити учасника клубу.
//5) видалити конкретну тваринку з усіх власників.
//        6) вивести на екран зооклуб.
//Подумати яким повинен бути Person, щоб була можливість додавати йому тваринку.
//Подумати яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку


public class Main {
    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub();
        Person person1 = new Person(1,"Vitaliy", new ArrayList<>());
        Person person2 = new Person(2,"Olga", new ArrayList<>());
        Pet pet1 = new Pet("cat", "Leopold", 7);
        Pet pet2 = new Pet("dog", "Lessi", 10);
        Pet pet3 = new Pet("squirrel", "Sonya", 2);

        zooClub.addPerson(person1);
        zooClub.addPerson(person2);
        zooClub.addPet(person1,pet1);
        zooClub.addPet(person1,pet2);
        zooClub.addPet(person2,pet2);
        zooClub.addPet(person2,pet3);
        zooClub.addPet(person2,pet1);

        System.out.println(zooClub);

        zooClub.removePet(person2, pet1);

        System.out.println(zooClub);

        zooClub.removePetFromAll(pet2);

        System.out.println(zooClub);

        zooClub.removePerson(person2);

        System.out.println(zooClub);
    }
}
