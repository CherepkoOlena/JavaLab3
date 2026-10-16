package task2;

public class Parallelepiped extends Body{
    int a, b, c;

    public Parallelepiped(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getVolume() {
        return (a*b*c);
    }

    @Override
    public double getSurface() {
        return 2*(a*b+b*c+a*c);
    }

    @Override
    public String toString() {
        return "Parallelepiped: ";
    }
}
