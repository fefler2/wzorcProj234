package WzorceProj.DemoUsunac;

import java.util.Arrays;
import java.util.List;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Kwadrat");
    }

    public static void main(String[] args) {

        List list = Arrays.asList(4,5,6);

        list.forEach(o-> System.out.println(o));
    }
}
