public class Test {
        public static void main(String[] args) {

           WriteShape rectangle = new WriteShape();
           rectangle.writeShape(new Rectangle());

           WriteShape quad = new WriteShape();
           quad.writeShape(new Quad());

           WriteShape triangle = new WriteShape();
           triangle.writeShape(new Triangle());

           WriteShape circle = new WriteShape();
           circle.writeShape(new Circle());

           WriteShape trapeze = new WriteShape();
           trapeze.writeShape(new Trapeze());
        }
    }


