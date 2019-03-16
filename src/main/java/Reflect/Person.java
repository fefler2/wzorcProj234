package Reflect;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumPeople() {
        return numPeople;
    }

    public static void setNumPeople(int numPeople) {
        Person.numPeople = numPeople;
    }

    public Person(String name) {
        this.name = name;

        numPeople++;
    }

    private String name;
    private static int numPeople = 0;
}
