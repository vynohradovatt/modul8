public abstract class Shape {
    public static String color;
    public static void setColor(String color) {
        Shape.color = color;
    }
    public abstract String color();

    public abstract String name();


}


