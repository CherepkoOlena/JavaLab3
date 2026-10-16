public class Person {
    int age;
    String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void Show(){
        System.out.printf("%d, %s\n", this.age, this.name);
    }
}
