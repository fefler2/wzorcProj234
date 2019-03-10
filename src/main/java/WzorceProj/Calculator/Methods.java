package WzorceProj.Calculator;

import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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


        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        set.add(4);
        set.add(45);
        set.add(21);
        set.add(-23);
        set.add(2);



        Map<Integer, Integer> map = new HashMap<>();
        map.put(4,16);
        map.put(3,9);
        map.put(6,36);
        map.put(5,25);
        map.put(8,64);
        map.put(2,4);


        System.out.println();




// dodawanie kilku elementów do mapy

        Map map2 = map.entrySet()
                .stream()
//                .filter(o->o.getKey()>3).collect(Collectors.toMap(Function.identity(), o->( " "))); // syntax error
                .filter(o->o.getKey()>3).collect(Collectors.toMap(Function.identity(), o->true)); // syntax error

        System.out.println(map2);
        System.out.println(map2.keySet());
        System.out.println(map2.values());





//        System.out.println();
//
//        List<Integer> integers = IntStream.
//                rangeClosed(1,10).boxed().collect(Collectors.toList());
//
//
//        integers.stream().map(x->x*x).
//                filter(o->o%2==0 || o%3==0).forEach(s-> System.out.println(s));

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

    public static int addInStatic(int a, int b){
        return a+b;
    }

}
