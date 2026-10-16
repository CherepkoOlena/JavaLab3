package task1;

public class Worker extends Person{
    int exp;

    public Worker(int age, String name, int exp){
        super(age, name);
        this.exp = exp;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.printf("Experience: %d ", this.exp);
    }
}
