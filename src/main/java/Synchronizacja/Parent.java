package Synchronizacja;

class Parent {

    void foo(){
        System.out.println("Foo in parent");
    }

    static void bar(){
        System.out.println("Bar in parent");
    }

}

class Child extends Parent{

    void foo(){
        System.out.println("Foo in child");
    }

    static void bar(){
        System.out.println("Bar in child");
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = new Child();
//        Child child = new Parent(); // nie dziala
//        Child child2 = (Child) new Parent(); // dziala

        parent.foo(); // nadpisanie
        child.foo(); // zwyczajne nadpisanie obiektu tej klasy

        parent.bar();// tzw static binding - statyczne metody
               // nie sa nadpisywane
        child.bar(); // wywolanie statycznej metody






    }
}
