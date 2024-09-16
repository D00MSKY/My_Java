package HW.Task_4.Task_4_4;

import java.util.*;

public class ZooClub {

    private Map <Person, List<Pet>> club = new TreeMap<>();


    public ZooClub() {
    }

    public ZooClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    public Map<Person, List<Pet>> getClub() {
        return club;
    }

    public void setClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                "club=" + club +
                '}';
    }

    public void addPerson (Person person){
        club.put(person, new ArrayList<>());
    }

    public void addPet (Person person, Pet pet){
        List<Pet> pets = club.get(person);
            pets.add(pet);

    }

    public void removePet (Person person, Pet pet){
        List<Pet> pets = club.get(person);
            pets.remove(pet);
    }

    public void removePetFromAll (Pet pet){
        for (Map.Entry<Person, List<Pet>> entry: club.entrySet()){
            List<Pet> pets = entry.getValue();
            pets.remove(pet);
        }
    }

    public void removePerson (Person person){
        club.remove(person);
    }
}
