package task1;

public class Specialist extends Person{
    String department;

    public Specialist(int age, String name, String department){
        super(age, name);
        this.department = department;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.printf("Department: %s ", this.department);
    }
}
