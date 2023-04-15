abstract class Shape{
    abstract void getSides();
}
class Triangle extends Shape{
    void getSides(){
        System.out.println("Triangle has 3 sides");
    }
}
class Rectangle extends Shape{
    void getSides(){
        System.out.println("Rectangle has 4 sides");
    }
}
class Hexagon extends Shape{
    void getSides(){
        System.out.println("Hexagon has 6 sides");
    }
}
class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Hexagon hexagon = new Hexagon();
        triangle.getSides();
        rectangle.getSides();
        hexagon.getSides();
    }
}