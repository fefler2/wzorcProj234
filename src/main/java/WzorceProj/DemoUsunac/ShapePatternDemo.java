package WzorceProj.DemoUsunac;

public class ShapePatternDemo {

    int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Circle");
        shape.draw();
    }

    public int multiple(int i, int j) {
        return i*j;
    }
}
