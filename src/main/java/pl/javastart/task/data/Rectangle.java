package pl.javastart.task.data;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(final double a, final double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double calculateRectPerimeter() {
        return (2 * a) + (2 * b);
    }
}
