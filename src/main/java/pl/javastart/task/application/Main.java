package pl.javastart.task.application;

import pl.javastart.task.data.Circle;
import pl.javastart.task.data.Rectangle;
import pl.javastart.task.data.Square;
import pl.javastart.task.data.Triangle;
import pl.javastart.task.logic.ShapeCalculator;

public class Main {

    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(6, 7);
        Square square = new Square(2);
        Triangle triangle = new Triangle(3, 4, 5);

        double squareArea = shapeCalculator.calculateSquareArea(square);
        double circleArea = shapeCalculator.calculateCircleArea(circle);
        double trianglePerimeter = shapeCalculator.calculateTrianglePerimeter(triangle);
        double rectPerimeter = shapeCalculator.calculateRectPerimeter(rectangle);

        System.out.printf("Pole kwadratu o boku %.2f cm wynosi: %.2f cm2 \n", square.getA(), squareArea);
        System.out.printf("Pole koła o promieniu %.2f cm wynosi: %.2f cm2 \n", circle.getRadius(), circleArea);
        System.out.printf("Obwód trójkąta o bokach %.2f, %.2f, %.2f cm wynosi: %.2f cm \n", triangle.getA(), triangle.getB(), triangle.getC(), trianglePerimeter);
        System.out.printf("Obwód prostokąta o bokach %.2f, %.2f cm wynosi: %.2f cm \n", rectangle.getA(), rectangle.getB(), rectPerimeter);
    }
}
