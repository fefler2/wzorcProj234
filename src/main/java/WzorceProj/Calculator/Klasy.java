package WzorceProj.Calculator;

public class Klasy {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new
                InnerClass();

        OuterClass.StaticNestedClass staticNestedClass = new
                OuterClass.StaticNestedClass();

        innerClass.showGreetings();
        OuterClass.InnerClass.VeryInnerClass veryInnerClass =
                innerClass.new VeryInnerClass();
        int a = veryInnerClass.add(4, 3);
        OuterClass.InnerClass.VeryInnerClass.VeryVeryInner
                veryVeryInner = veryInnerClass.new VeryVeryInner();
        veryVeryInner.showG();
        System.out.println(veryVeryInner.getClass().
        equals((String ) "Calculator.OuterClass$InnerClass$VeryInnerClass$VeryVeryInner"));


    }
}
