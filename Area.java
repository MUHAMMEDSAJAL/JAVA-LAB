import java.io.*;

class Shape {

    void Area(double a) {
        double Area = 3.14 * a * a;
        System.out.println("Area of the Circle   : " + Area);
    }

    void Area(int a, int b) {
        int Area = a * b;
        System.out.println("Area of the Rectangle: " + Area);
    }
    void Area(double a, double b) {
        double Area = 0.5 * a * b;
        System.out.println("Area of the Triangle : " + Area);
    }
}

class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
	    shape.Area(10.5);         //Area of Circle
        shape.Area(3.2, 4.5);     //Area of Triangle
        shape.Area(5, 4);         //Area of Rectangle
    }
}