package Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;


public class Main {


    Exception throwExc() throws Exception {
        throw new Exception("");
    }


    public static void main(String[] args) {
        /*
        If inherited, replace:

        getDeclaredField -> getField
        getDeclaredMethod -> getMethod

         */

        Person p = new Person("Pogo");
//        System.out.println(p.name); // syntax error -
            // zmienna name jest private

        try {
            Field field = p.getClass().getDeclaredField("name");
            field.setAccessible(true);
            System.out.println(field.get(p));

        }
        catch (Exception e){
            e.printStackTrace();
        }

//        System.out.println(Person.numPeople); // syntax, error
        try {
            //                  static
            Field field = Person.class.getDeclaredField("numPeople");
            field.setAccessible(true);
            System.out.println(field.get(null));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(p.getName());

        try {
            Method method = p.getClass().getDeclaredMethod("getName");
            System.out.println(method.invoke(p));
            System.out.println(p.getName());

        }
        catch (Exception e){

        }


    }
}
