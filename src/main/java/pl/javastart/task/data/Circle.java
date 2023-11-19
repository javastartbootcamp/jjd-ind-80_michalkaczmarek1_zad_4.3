package pl.javastart.task.data;

public class Circle {
    private double radius;

    public Circle(final double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateCircleArea() {
        return Math.PI * (Math.pow(radius, 2));
    }
}
