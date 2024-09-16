package HW.Task_4.Task_4_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


//Створити клас котрий відповідає наступній моделі
//{
//id: 1,
//name: 'vasya',
//surname: 'pupkin',
//email: 'asd@asd.com',
//age: 31,
//gender: 'MALE',
//skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//car: {model: 'toyota', year: 2021, power: 250}
//        }
//Використати композицію/агрегацію та енуми в потрібному місці.
//Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
//Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(
                1,
                "Oleg",
                "Verbitskiy",
                "Oleg@gmail.com",
                18,
                Gender.MALE,
                new Car("Toyota", 2020, 150)
        );

                employee1.getSkills().add(new Skill("html", 1));
                employee1.getSkills().add(new Skill("css", 1));



                Employee employee2 = new Employee(
                2,
                "Anton",
                "Antonov",
                "AA@gmail.com",
                22,
                Gender.MALE,
                new Car("Mazda", 2000, 180)
        );

                employee2.getSkills().add(new Skill("html", 3));
                employee2.getSkills().add(new Skill("css", 3));
                employee2.getSkills().add(new Skill("js", 2));


        Employee employee3 = new Employee(
                3,
                "Alyona",
                "Fadeeva",
                "FadA@gmail.com",
                20,
                Gender.FEMALE,
                new Car("Shevrolet", 2015, 130)
        );

        employee3.getSkills().add(new Skill("html", 2));
        employee3.getSkills().add(new Skill("css", 2));
        employee3.getSkills().add(new Skill("js", 1));
        employee3.getSkills().add(new Skill("java", 1));


        Employee employee4 = new Employee(
                4,
                "Oksana",
                "Boyko",
                "B.Oksana@gmail.com",
                29,
                Gender.FEMALE,
                new Car("BMW", 2024, 280)
        );

        employee4.getSkills().add(new Skill("html", 9));
        employee4.getSkills().add(new Skill("css", 9));
        employee4.getSkills().add(new Skill("js", 9));
        employee4.getSkills().add(new Skill("java", 10));
        employee4.getSkills().add(new Skill("C++", 8));


        Employee employee5 = new Employee(
                5,
                "Natalya",
                "Korovkina",
                "KN2004@gmail.com",
                20,
                Gender.FEMALE,
                new Car("Porshe", 2014, 300)
        );

        employee5.getSkills().add(new Skill("js", 2));


        Employee employee6 = new Employee(
                6,
                "Artem",
                "Fedorenko",
                "Fada@gmail.com",
                30,
                Gender.MALE,
                new Car("Daewoo", 2000, 150)
        );

        employee6.getSkills().add(new Skill("html", 3));
        employee6.getSkills().add(new Skill("css", 3));


        Employee employee7 = new Employee(
                7,
                "Boris",
                "Bobrenko",
                "BB2002@gmail.com",
                22,
                Gender.MALE,
                new Car("Mazda", 2024, 160)
        );

        employee7.getSkills().add(new Skill("html", 3));
        employee7.getSkills().add(new Skill("css", 3));
        employee7.getSkills().add(new Skill("js", 2));
        employee7.getSkills().add(new Skill("mySql", 6));
        employee7.getSkills().add(new Skill("C++", 4));



        Employee employee8 = new Employee(
                8,
                "Anastasiya",
                "Nosenko",
                "Nasa@gmail.com",
                45,
                Gender.FEMALE,
                new Car("Cadillac", 2022, 320)
        );

        employee8.getSkills().add(new Skill("html", 3));
        employee8.getSkills().add(new Skill("css", 3));
        employee8.getSkills().add(new Skill("mongoDB", 2));



        Employee employee9 = new Employee(
                9,
                "Serhiy",
                "Seregin",
                "Serg01@gmail.com",
                37,
                Gender.MALE,
                new Car("Tesla", 2020, 200)
        );

        employee9.getSkills().add(new Skill("html", 3));
        employee9.getSkills().add(new Skill("css", 3));
        employee9.getSkills().add(new Skill("js", 2));
        employee9.getSkills().add(new Skill("mongoDB", 2));
        employee9.getSkills().add(new Skill("mySql", 6));
        employee9.getSkills().add(new Skill("C++", 4));



        Employee employee10 = new Employee(
                10,
                "Oleksandr",
                "Kostenko",
                "Kos1@gmail.com",
                35,
                Gender.MALE,
                new Car("Mercedes", 2023, 250)
        );


        employee10.getSkills().add(new Skill("js", 2));
        employee10.getSkills().add(new Skill("mongoDB", 2));
        employee10.getSkills().add(new Skill("mySql", 6));
        employee10.getSkills().add(new Skill("C++", 4));

        HashSet<Employee> employees = new HashSet<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);
        employees.add(employee10);

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee next =  iterator.next();
            if (next.getGender() == Gender.MALE){
                iterator.remove();
            }
        }


        System.out.println(employees);


        TreeSet <Employee> employeeSet = new TreeSet<>();
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);
        employeeSet.add(employee6);
        employeeSet.add(employee7);
        employeeSet.add(employee8);
        employeeSet.add(employee9);
        employeeSet.add(employee10);

        System.out.println(employeeSet);

    }

}
