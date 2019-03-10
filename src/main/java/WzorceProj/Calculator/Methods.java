package WzorceProj.Calculator;

import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiple(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println(methods.divide(4, 2));

        List list = Arrays.asList(2,3,4,5,6);

        list.forEach(o -> System.out.print(o + ", "));
        list.forEach(o-> System.out.println(o));

        System.out.println();


        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(3);
        list2.add(11);
        list2.add(2);





        list2.stream().sorted().forEach(o-> System.out.println(o));

        System.out.println();

        List<String > names = Arrays.asList("John", "Sam", "Greg", "Ryan");
        names.stream()
                .map(n->new User(n)).forEach(System.out::println);

        System.out.println(list2);

        list.stream().map(o -> o).collect(Collectors.toList());


        List list1 = new ArrayList(Arrays.asList(34,3,2,1));

        List list3 = (List) list.stream().collect(Collectors.toList());
        System.out.println(list3 + " abc");

        List<String > letters = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
        String s = "";
        for (String letter : letters) {
            s+=letter;
        }
        System.out.println(s);

        String s2 = letters.stream().collect(Collectors.joining());
        System.out.println(s2);

        List<String > stringList = new ArrayList<>();
        stringList.add("ab");
        stringList.add("cd");
        stringList.add("ef");
        stringList.add("gh");

        String s3= stringList.stream().collect(Collectors.joining(", "));
        System.out.println(s3);


        list2.stream().map(o->o*2).forEach(o-> System.out.println(o));

    }




    static class User{
        public User(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        private String name ="John";
        private Integer age;
    }

    public int divide(int a, int b) {


        return a / b;
    }

    public long factorial(int n) {
        return CombinatoricsUtils.factorial(n);
    }


    public long powerOf(int a, int b) {
        return ArithmeticUtils.pow(a, b);
    }

    public Exception throwException() throws Exception {
        throw new Exception();
    }

}
