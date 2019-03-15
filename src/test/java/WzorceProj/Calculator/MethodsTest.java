package WzorceProj.Calculator;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assumptions.*;



import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    public int d = 44;

    Methods methods;

    int a = 33;

    @BeforeEach
    void init() {
        methods = new Methods();
    }
//


    @Test
    void add() {
        assumeTrue(false);
        assertEquals(33, methods.add(22, 11));
        a = 11;

    }


    @Test
    void subtract() {
        assertEquals(44, methods.subtract(55, 11));
        System.out.println(a);
    }

    @Test
    void multiple() {
        a=22;
        assertEquals(22, methods.multiple(2, 11));


    }


    @Test
    void divide() {

        assertEquals(3, methods.divide(9, 3));
        assertThrows(Exception.class, () -> methods.divide(1, 0));
        assertThrows(ArithmeticException.class, () -> methods.divide(1, 0));


    }

    @Test
    void factorial() {
        assertEquals(120, methods.factorial(5), "Should be factorial result");
    }

    @Test
    void powerOf() {
        assertEquals(256, methods.powerOf(2, 8));
    }

    @Test
    void throwException() throws Exception {
        assertThrows(ArithmeticException.class, () -> methods.divide(4, 0));
        System.out.println("abcd");

    }

    @Test
    @Disabled
    void addInStatic() {
        assertEquals(32, Methods.addInStatic(3, 29));

    }

    @Test
    void computerCircleArea() {
        assertEquals(314, methods.computerCircleArea
                (10), "Should return circle area");

    }

    @Test
    void throwException2(){
        assertThrows(Exception.class, () -> methods.throwException2());
    }

}