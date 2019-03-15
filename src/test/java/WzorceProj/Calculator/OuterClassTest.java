package WzorceProj.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OuterClassTest {

    OuterClass outerClass = new OuterClass();

    @Test
    void add(){
        assertEquals(22, outerClass.add(10,12));
    }
}