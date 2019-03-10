package WzorceProj.Calculator;


class SuperClass {
    public int a = 33;

    SuperClass() {
        a = 22;
    }


}

public class WeirdClass extends SuperClass {

    private int a = 4;

    class InnerClass {
        int a = 5;

        private double add(double a, float b) {
            return (int) a + b;
        }

        class InnerClassInInnerClass {
            double a = 11.2d;

        }
    }

    static class StaticClass {
        static int a = 44;
    }

    public static void main(String... args) {
        int a = 6;
        WeirdClass weirdClass = new WeirdClass();
        WeirdClass.InnerClass innerClass =
                weirdClass.new InnerClass();

        Double aDouble = innerClass.add(a, innerClass.a);


        System.out.println(WeirdClass.InnerClass.class.toString()
                == WeirdClass.InnerClass.class.toString());


        System.out.println(WeirdClass.InnerClass.class
                .equals(WeirdClass.InnerClass.class));


        System.out.println("Number is " + 2 + aDouble);


        SuperClass superClass = new SuperClass();
        System.out.println(superClass.a++ + -4.0);

        char c = 20;
        System.out.println(c + 2 + " " + c);

        WeirdClass.InnerClass.InnerClassInInnerClass innerClass1 =
                innerClass.new InnerClassInInnerClass();

        System.out.println(innerClass1.a == 11.2 & 4.9 >= +3.9);

        Exception exception = new Exception("Error");
        System.out.println(exception.equals(Error.class.toString()));

        int j = 2;
        for (int i = 0; i < 100; i++) {
            if (--j > -100) {
                continue;
            }
        }
        System.out.println(j);


        int k = 5;
        k = k + k;
        System.out.println(-k);


        SuperClass superClass1 = new WeirdClass();

        System.out.println(superClass1.a);


        if (superClass instanceof SuperClass && k == Integer.parseInt("5")) {

            WeirdClass weirdClass1 = (WeirdClass) new SuperClass();
        }

        WeirdClass.StaticClass staticClass = new WeirdClass.StaticClass();
        System.out.println((double) staticClass.a== (float) 44);


        for (; ; ) {
            ;
            ;
            return;
        }


    }

}
