package Synchronizacja;


class Counter {
    int count;

    public void increment(){
        count++;
    }
}


public class SyncDemo {

    public static void main(String[] args) {

        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println("Counter " + counter.count);


    }
}
