package HW.Task_5.Task_5_3;

//Це абстрактне завдання, в якого ыснуэ 100500 способів вирішення, тому його сприймате просто як список можливих варіацій бізнес процесів.
//        Вважайте, що тут нема правильної відповіді
//
//Створити клас автомобіля з полями:
//        Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//Власник автомобіля теж має бути обєкт, у якого є поля
//Імя, вік, стаж водіння.
//Створити не менше 7 та не більше 20 машинок.
//Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
//Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
//Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
//Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
//Все через stream API


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(
                "BMW",
                350,
                new Driver("Serhiy", 44,3 ),
                45000,
                2022
        );
        Car car2 = new Car(
                "Nissan",
                230,
                new Driver("Oleg", 20, 1),
                15000,
                2018
        );
        Car car3 = new Car(
                "Suzuki",
                140,
                new Driver("Andriy", 30, 7),
                10000,
                2015
        );
        Car car4 = new Car(
                "Mercedes",
                200,
                new Driver("Olga", 24, 6),
                22000,
                2018
        );
        Car car5 = new Car(
                "Toyota",
                150,
                new Driver("Denis", 37, 19),
                17000,
                2024
        );
        Car car6 = new Car(
                "Opel",
                130,
                new Driver("Marina", 40, 20),
                10000,
                2014
        );
        Car car7 = new Car(
                "Tesla",
                220,
                new Driver("Gleb", 29, 1),
                35000,
                2017
        );
        Car car8 = new Car(
                "Range rover",
                280,
                new Driver("Oleksandr", 55, 30),
                60000,
                2023
        );
        Car car9 = new Car(
                "Chevrolet",
                150,
                new Driver("Dmitro", 32, 10),
                5000,
                2015
        );
        Car car10 = new Car(
                "Daewoo",
                150,
                new Driver("Evgen", 41, 5),
                3000,
                2010
        );


        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

        System.out.println(cars);

        Stream<Car> stream = cars.stream();
        List<Car> boostedCars = stream
                .limit(5)
                .map(car -> {car.setPower((int) (car.getPower() * 1.1));
                    return car;
                })
                .collect(Collectors.toList());

        Stream<Car> stream1 = cars.stream();
        List<Car> notBoostedCars = stream1
                .skip(5)
                .limit(5)
                .collect(Collectors.toList());

        List<Car>allCars = new ArrayList<>();
        allCars.addAll(boostedCars);
        allCars.addAll(notBoostedCars);

        System.out.println(allCars);

        Stream<Car> stream2 = allCars.stream();
        List<Car> completedCourses = stream2
                .filter(car -> car.getDriver().getDrivingExperience() < 5 && car.getDriver().getAge() > 25)
                .map(car -> {car.getDriver().setDrivingExperience(car.getDriver().getDrivingExperience() + 1);
                return car;
                })
                .collect(Collectors.toList());

        System.out.println(completedCourses);

        Stream<Car> stream3 = allCars.stream();
        int priceOfCars = stream3
                .collect(Collectors.summingInt(car -> car.getPrice()));

        System.out.println(priceOfCars);

    }
};
