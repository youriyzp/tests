package test_2_17_Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Increment {
    public static void main(String[] args) {
        AtomicInteger i= new AtomicInteger(0);
        increment (i);
        System.out.println(i);

    }
    static  void increment (AtomicInteger atomicInteger){
        atomicInteger.incrementAndGet();

    }
}
