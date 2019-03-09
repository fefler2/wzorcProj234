package WzorceProj.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    Methods methods;
    @BeforeEach
    void init() {
        methods = new Methods();
    }
//


    @Test
    void add() {
        assertEquals(33, methods.add(22, 11));
    }




    @Test
    void subtract() {
        assertEquals(44, methods.subtract(55, 11));
    }

    @Test
    void multiple() {
        assertEquals(22, methods.multiple(2, 11));
    }


    @Test
    void divide() {
        assertEquals(3, methods.divide(9, 3));
    }

    @Test
    void factorial() {
        assertEquals(120, methods.factorial(5));
    }

    @Test
    void powerOf(){
        assertEquals(256,methods.powerOf(2,8));
    }

}