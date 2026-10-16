import task1.*;
import task2.*;
import task3.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose task: ");
        int task = scanner.nextInt();
        if (task == 1)
            task1(scanner);
        if (task == 2)
            task2(scanner);
        if (task == 3)
            task3(scanner);
    }

    private static void task1(Scanner scanner) {
        Person[] persons = new Person[4];
        persons[0] = new Person(30, "Astarion");
        persons[1] = new Worker(26, "Karlach", 3);
        persons[2] = new Specialist(31, "Will", "Architect");
        persons[3] = new Engineer(35, "Shadow", "Princess", "Shadow");

        for (int i = 0; i < persons.length; i++) {
            persons[i].Show();
            System.out.println();
        }
    }

    private static void task2(Scanner scanner) {
        Body[] body = new Body[2];
        body[0] = new Parallelepiped(2, 8, 15);
        body[1] = new Ball(6);

        for (int i = 0; i < body.length; i++) {
            System.out.println(body[i]);
            System.out.printf("Surface: %.2f, Volume: %.2f\n", body[i].getSurface(), body[i].getVolume());
        }
    }

    private static void task3(Scanner scanner) {
        IBody[] body = new IBody[2];
        body[0] = new IParallelepiped(2, 8, 15);
        body[1] = new IBall(6);

        for (int i = 0; i < body.length; i++) {
            System.out.println(body[i]);
            System.out.printf("Surface: %.2f, Volume: %.2f\n", body[i].getSurface(), body[i].getVolume());
        }
    }

}