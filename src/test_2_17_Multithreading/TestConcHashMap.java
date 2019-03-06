package test_2_17_Multithreading;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestConcHashMap extends Thread {
    private String name;
    private static Map<String, String> cmap = new ConcurrentHashMap<String, String>();

    TestConcHashMap(String name) {
        this.name = name;
    }

    public void run() {
        cmap.put(name + "1", "A");
        cmap.put(name + "2", "B");
        cmap.put(name + "3", "C");
        cmap.put(name + "4", "D");
        cmap.put(name + "5", "E");
        System.out.println(name + "Completed");

    }


    public static void main(String[] args) {
        TestConcHashMap th1= new TestConcHashMap("One");
        TestConcHashMap th2= new TestConcHashMap("Two");
        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(cmap);

    }
}