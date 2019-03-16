package Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Foo {
    void hello(){
        System.out.println("Hello method");
    }
}

public class Klasa {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Foo foo = new Foo();
        foo.hello();

        Class c1 = Class.forName("Reflect.Foo");
        Method method = c1.getDeclaredMethod("hello");
        method.invoke(c1.newInstance());
    }
}
