package HW.Task_2.Task_2_2;


//Створити та описати наступну їєрархію
//PC-Laptop-Ultrabook
//PC-Laptop- Workstation
//Загальна кількість вкористаних класів - 4!

public class Main {
    public static void main(String[] args) {

        PC pc = new PC(8, 16, 20);
        Laptop laptop = new Laptop(6, 16, 15, 1.75, 4000);
        Ultrabook ultrabook = new Ultrabook(6, 12, 15, 1.01, 2500, 0.9 );
        Workstation workstation = new Workstation(8, 32, 19, 2.2, 4500, "AMD");

        System.out.println(pc);
        System.out.println(laptop);
        System.out.println(ultrabook);
        System.out.println(workstation);
    }
}
