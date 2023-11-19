package pl.javastart.task.application;

import pl.javastart.task.data.Circle;
import pl.javastart.task.data.Rectangle;
import pl.javastart.task.data.Square;
import pl.javastart.task.data.Triangle;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(6, 7);
        Square square = new Square(2);
        Triangle triangle = new Triangle(3, 4, 5);

        double squareArea = square.calculateSquareArea();
        double circleArea = circle.calculateCircleArea();
        double trianglePerimeter = triangle.calculateTrianglePerimeter();
        double rectPerimeter = rectangle.calculateRectPerimeter();

        System.out.printf("Pole kwadratu o boku %.2f cm wynosi: %.2f cm2 \n", square.getA(), squareArea);
        System.out.printf("Pole koła o promieniu %.2f cm wynosi: %.2f cm2 \n", circle.getRadius(), circleArea);
        System.out.printf("Obwód trójkąta o bokach %.2f, %.2f, %.2f cm wynosi: %.2f cm \n", triangle.getA(), triangle.getB(),
                triangle.getC(), trianglePerimeter);
        System.out.printf("Obwód prostokąta o bokach %.2f, %.2f cm wynosi: %.2f cm \n", rectangle.getA(), rectangle.getB(), rectPerimeter);
    }
}
