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
    }

    private static void task3(Scanner scanner) {
    }

}