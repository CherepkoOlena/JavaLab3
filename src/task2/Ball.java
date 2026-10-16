package task2;

public class Ball extends Body{
    int r;

    public Ball(int r){
        this.r = r;
    }

    @Override
    public double getVolume() {
        return (4/3)*Math.PI*Math.pow(r,3);
    }

    @Override
    public double getSurface() {
        return 4*Math.PI*Math.pow(r, 2);
    }

    @Override
    public String toString() {
        return "Ball: ";
    }
}
