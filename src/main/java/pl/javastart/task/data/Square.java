package pl.javastart.task.data;

public class Square {
    private double a;

    public Square(final double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double calculateSquareArea() {
        return Math.pow(a, 2);
    }

}
