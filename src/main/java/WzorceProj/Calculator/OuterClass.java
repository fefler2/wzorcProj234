package WzorceProj.Calculator;

public class OuterClass  {

    private int a = 44;
    private static int b = 55;

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();


    }

    static class StaticNestedClass {

    }

    class InnerClass {

        OuterClass.InnerClass innerClass;

        String s = "Abc";
        public void showGreetings(){
            System.out.println("Hello");
            System.out.println(a);
            System.out.println(OuterClass.b);



        }
        class VeryInnerClass {
            public int add(int a, int b){
                return a+b;

            }

            class VeryVeryInner{
                void showG(){
                    System.out.println("We must go deeper");
                }
            }


        }

    }
}
