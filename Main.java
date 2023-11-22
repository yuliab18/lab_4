package geometryy;



public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(6,5,1);
 System.out.println("Площа кола:" + circle.area());
 circle.Info();

        Rectangle rectangle = new Rectangle(12, 10, "Blue");
 System.out.println("Площа прямокутника:" +rectangle.area(5, 8));
 rectangle.Info();
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.areaDemo());
        rectangle.areaDemo();

        Triangle triangle = new Triangle(2, 2, 2);
        Triangle triangle2 = new Triangle(3);
        Triangle triangle3 = new Triangle(7, 7, 4);
        Triangle triangle4 = new Triangle();
        System.out.println("Площа трикутника:" +triangle.area());
        System.out.println(triangle2.area());
        System.out.println(triangle3.area());
        System.out.println(triangle4.area());
        System.out.println(triangle.equals(triangle3));
        triangle.Info();

        Triangle22 triangle22 = new Triangle22(7);
        System.out.println(triangle22.halfTriangle22());

        // Визначення периметра
        double perimeter = Parallelogram.calculatePerimeter();
        System.out.println("Периметр паралелограма: " + perimeter);

        // Визначення площі
        double area = Parallelogram.calculateArea();
        System.out.println("Площа паралелограма: " + area);


        Pyramid pyramid = new Pyramid();
        // Викликати метод calculateVolume
        pyramid.calculateVolume();
        // Викликати метод calculateSurfaceArea
        pyramid.calculateSurfaceArea();

        RightTriangle rightTriangle = new RightTriangle(3, 4, 5);
        rightTriangle.InfoAndArea();
        rightTriangle.testRightTriangle();

    }


}