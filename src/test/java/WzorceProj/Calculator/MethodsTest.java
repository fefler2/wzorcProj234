package WzorceProj.Calculator;

import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;

import static org.junit.jupiter.api.Assumptions.*;


import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class MethodsTest {

    public int d = 44;

    Methods methods;

    int a = 33;

    TestInfo testInfo;
    TestReporter testReporter;

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        methods = new Methods();

        if (testInfo.getTags().equals("Math")) {

            testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tags " +
                    testInfo.getTags());
        }

//        testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tags " +
//                testInfo.getTags());
    }

    @Test
    void addStat() {
        assertEquals(7, Methods.addStat(4, 3));
    }

    @Test
    void isOdd() {
        assertTrue(Methods.isOdd(5));

        assertTrue(Methods.isOdd(3));

        assertTrue(Methods.isOdd(9));

        List list = new ArrayList();
        list.add(4);
        list.add(33);
        list.add(22);
        List list2 = list;
        List list3 = new ArrayList();
        list3.add(4);
        list3.add(33);
        list3.add(22);

        assertEquals(list, list3);

        Map map = new HashMap();
        map.put(7,33);
        map.put(4,22);
        map.put(2,3);

        Map map2 = new HashMap();
        map2.put(7,33);
        map2.put(4,22);
        map2.put(2,3);

        assertEquals(map, map2);
//        assertSame(list, list3);
//        assertArrayEquals(list, list);

    }

    @ParameterizedTest
    @ValueSource(ints = {3, 5, 1, 99, 53, -43})
    void isOddParametrizedTest(int n) {

        assertTrue(Methods.isOdd(n));

    }
//


    @Nested
    @DisplayName("Add Test Class")
    class AddTest {

        @Test
        @Tag("Math")
        void addPostive() {
            assertEquals(33, methods.add(22, 11));
        }

        @Test
        void addNegative() {
            assertEquals(-23, methods.add(-19, -4));
        }

    }


    @Test
    @EnabledOnJre(JRE.JAVA_9)
        // jest 8 wersja wiec nie failuje
    void subtract() {
        assertEquals(44, methods.subtract(55, 11));
        System.out.println(a);
//        fail();
    }

    @Test
    @Tag("Math")
    void multiple() {


        testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tags " +
                testInfo.getTags());

        assertAll(
                () -> assertEquals(22, methods.multiple(2, 11)),
                () -> assertEquals(0, methods.multiple(4, 0)),
                () -> assertNotEquals(-3, methods.multiple(4, 2))


        );

        assertAll("lol", () -> assertTrue(methods.multiple(4, 3) > 5));


    }


    @Test

    @Tag("Math")
    void divide() {
//        assumeTrue(false);
//        fail();

        assertEquals(3, methods.divide(9, 3));
        assertThrows(Exception.class, () -> methods.divide(1, 0));
        assertThrows(ArithmeticException.class, () -> methods.divide(1, 0));


    }

    @Test
    @Tag("Math-advanced")
    void factorial() {
        assertEquals(120, methods.factorial(5), "Should be factorial result");
    }

    @Test
    @Tag("Math-advanced")
    void powerOf() {
        assertEquals(256, methods.powerOf(2, 8));
    }

    @Test
    void throwException() throws Exception {
        assertThrows(ArithmeticException.class, () -> methods.divide(4, 0));
        System.out.println("abcd");

    }

    @Test
//    @Disabled
    void addInStatic() {
        assertEquals(32, Methods.addInStatic(3, 29));

    }

    @RepeatedTest(1)
    void computerCircleArea() {
        assertEquals(314, methods.computerCircleArea
                (10), "Should return circle area");


    }

    @Test
    void throwException2() {
        assertThrows(Exception.class, () -> methods.throwException2());
    }


}
