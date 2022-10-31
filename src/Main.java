import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.model = "Nissan";
        car.name = "Skylane";
        car.obiom = 3;
        System.out.println(car.name + " " + car.model + " " + car.obiom);

        Scanner sc = new Scanner(System.in);
        Programmer prg = new Programmer();
        System.out.print("Name: ");
        prg.name = sc.nextLine();
        System.out.print("Surname: ");
        prg.surname = sc.nextLine();
        System.out.print("Age: ");
        prg.age = sc.nextInt();

        System.out.println(prg.name + " " + prg.surname + " " + prg.age + "\nJyly: " + prg.getAge());
        System.out.println();

    }
}