package Reflect;

import java.lang.reflect.Field;




public class Main {


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

    }
}
