package WzorceProj.DemoUs;

import java.util.ArrayList;
import java.util.List;

public class ShapeDemo {


    synchronized  int metoda(int a, int b){
        return 4;
    }




    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeKwadrat = shapeFactory.getShape("Kwadrat");
        shapeKwadrat.draw();

        Shape shapeProstokat = shapeFactory.getShape("Prostokat");
        shapeProstokat.draw();


        Singleton singleton = Singleton.getSingleton();

        List<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(21);
        list.add(99);

        list.stream().map(o->o*2).filter(o->o>22).forEach(o-> System.out.println(o));

    }
}
