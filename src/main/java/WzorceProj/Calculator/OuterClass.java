package WzorceProj.Calculator;

import org.junit.jupiter.api.Test;

public class OuterClass {

    private int a = 44;
    private static int b = 55;

    private class KlasaNr1221 {

    }

    int add(int a, int b) {
        return a + b;
    }

    boolean addTest(int a, int b) {
        OuterClass outerClass = new OuterClass();

        if (outerClass.add(a, b) == a + b) {
            return true;
        }

        return false;
    }



    public static void main(String[] args) {
        Methods methods = new Methods();
        OuterClass outerClass = new OuterClass();

        System.out.println(outerClass.addTest(5, 2));






    }


    static class StaticNestedClass {

    }

    class InnerClass {

        OuterClass.InnerClass innerClass;

        String s = "Abc";

        public void showGreetings() {
            System.out.println("Hello");
            System.out.println(a);
            System.out.println(OuterClass.b);


        }

        class VeryInnerClass {
            public int add(int a, int b) {
                return a + b;

            }

            class VeryVeryInner {
                void showG() {
                    System.out.println("We must go deeper");
                }
            }


        }

    }
}
