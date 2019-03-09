package WzorceProj.DemoUsunac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapePatternDemoTest {

    ShapePatternDemo shapePatternDemo = new ShapePatternDemo();

    @Test
    void add() {
        assertEquals(shapePatternDemo.add(2,3),5);

    }

    @Test
    void multiple(){
        assertEquals(shapePatternDemo.multiple(3,4),12);
    }
}