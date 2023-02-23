public abstract class Shape {

    public abstract  String nameShape();
    public abstract String color();

    public String figure(){
        return "Це геометрична фігура - ";
    }
}
class Quad extends Shape {
    @Override
    public String nameShape() {
        return "квадрат";
    }

    @Override
    public String color() {
        return "червоний";
    }
}
class Triangle extends Shape{

    @Override
    public String nameShape() {
        return "трикутник";
    }

    @Override
    public String color() {
        return "жовтий";
    }
}
class Circle extends Shape{

    @Override
    public String nameShape() {
        return "коло";
    }

    @Override
    public String color() {
        return "білий";
    }
}
class Trapeze extends Shape{

    @Override
    public String nameShape() {
        return "трапеція";
    }

    @Override
    public String color() {
        return "фіолетовий";
    }
}
class Rectangle extends Shape{

    @Override
    public String nameShape() {
        return "прямокутник";
    }

    @Override
    public String color() {
        return "синій";
    }
}
class Test {
    public static void main(String[] args) {
        Shape quad = new Quad();
        System.out.println(quad.figure() + quad.nameShape() + ", колір - " + quad.color() + ", ");

        Shape triangle = new Triangle();
        System.out.println(quad.figure() + triangle.nameShape() + ", колір - " + triangle.color());

        Shape circle = new Circle();
        System.out.println(quad.figure() + circle.nameShape() + ", колір - " + circle.color());

        Shape trapeze = new Trapeze();
        System.out.println(quad.figure() + trapeze.nameShape() + ", колір - " + trapeze.color());

        Shape rectangle = new Rectangle();
        System.out.println(quad.figure() + rectangle.nameShape() + ", колір - " + rectangle.color());

    }
}


