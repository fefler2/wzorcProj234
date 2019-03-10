package WzorceProj.Calculator;

import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;

import java.util.*;
import java.util.stream.Collectors;

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

        List list = Arrays.asList(2, 3, 4, 5, 6);

        list.forEach(o -> System.out.print(o + ", "));
        list.forEach(o -> System.out.println(o));

        System.out.println();


        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(3);
        list2.add(11);
        list2.add(2);


        list2.stream().sorted().forEach(o -> System.out.println(o));

        System.out.println();

        List<String> names2 = Arrays.asList("John", "Sam", "Greg", "Ryan");
        names2.stream()
                .map(n -> new User(n)).forEach(System.out::println);

        System.out.println(list2);

        list.stream().map(o -> o).collect(Collectors.toList());


        List<Integer> list1 = new ArrayList<>(Arrays.asList(34, 3, 2, 1));

        List list3 = (List) list.stream().collect(Collectors.toList());
        System.out.println(list3 + " abc");

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
        String s = "";
        for (String letter : letters) {
            s += letter;
        }
        System.out.println(s);

        String s2 = letters.stream().collect(Collectors.joining());
        System.out.println(s2);

        List<String> stringList = new ArrayList<>();
        stringList.add("ab");
        stringList.add("cd");
        stringList.add("ef");
        stringList.add("gh");

        String s3 = stringList.stream().collect(Collectors.joining(", "));
        System.out.println(s3);


        list2.stream().map(o -> o * 2).forEach(o -> System.out.println(o));


        List<String> names = Arrays.asList("Adam", "Brent",
                "Andrew", "Carl", "Doug", "Alex");


        ArrayList<String> namesWithA =
                new ArrayList<>();

        for (String name : names) {
            if (name.startsWith("A")) {
                namesWithA.add(name);
            }
        }
        System.out.println(namesWithA);


        List<String> namesWithA2 = names.stream().
                filter(x -> x.startsWith("A")).collect(Collectors.toList());

        System.out.println(namesWithA2);


        List<String> words = new ArrayList<>();
        words.add("abc");
        words.add("bcd");
        words.add("a");
        words.add("avf");
        words.add("f");

        List list4 = words.stream().
                filter(x -> x.startsWith("a") || x.endsWith("d"))
                .collect(Collectors.toList());

        List<String > stringList1 = words.stream().
                filter(x->x.startsWith("a") || x.equalsIgnoreCase("bcd"))
                .collect(Collectors.toList());

//        Set<Integer> integers = new HashSet<>();
//        integers.add(43);
//        integers.add(22);
//        integers.add(1);
//        integers.add(22);
//        integers.add(5);
//        integers.add(51);
//
//        System.out.println(integers);


    }


    static class User {
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

        private String name = "John";
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
