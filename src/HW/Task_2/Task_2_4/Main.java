package HW.Task_2.Task_2_4;


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


public class Main {
    public static void main(String[] args) {


    User user = new User(
            1,
            "Boris",
            "Borisov",
            "BB@gmail.com",
            32,
            Gender.MALE,
            new Car("Toyota", 2012, 189)
        );
            user.getSkills().add(new Skill("Java", 2));
            user.getSkills().add(new Skill("JS", 3));

        System.out.println(user);


    }
}
