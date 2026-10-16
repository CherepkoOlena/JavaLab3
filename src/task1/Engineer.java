package task1;

public class Engineer extends Specialist {
    String spec;

    public Engineer(int age, String name, String department, String spec){
        super(age, name, department);
        this.spec = spec;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.printf("Speciality: %s", this.spec);
    }
}
