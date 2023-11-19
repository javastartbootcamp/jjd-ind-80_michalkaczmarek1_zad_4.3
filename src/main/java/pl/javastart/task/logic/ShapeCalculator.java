package pl.javastart.task.logic;

import pl.javastart.task.data.Circle;
import pl.javastart.task.data.Rectangle;
import pl.javastart.task.data.Square;
import pl.javastart.task.data.Triangle;

public class ShapeCalculator {
    public double calculateSquareArea(Square square) {
        return Math.pow(square.getA(), 2);
    }

    public double calculateCircleArea(Circle circle) {
        return Math.PI * (Math.pow(circle.getRadius(), 2));
    }

    public double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    public double calculateRectPerimeter(Rectangle rectangle) {
        return (2 * rectangle.getA()) + (2 * rectangle.getB());
    }
}
