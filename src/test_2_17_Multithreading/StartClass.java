package test_2_17_Multithreading;

import com.sun.jdi.LongValue;

public class StartClass {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread() {
            public void run() {
                try {
                    sleep(Long.MAX_VALUE);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        };
        t.start();
        Thread.sleep(1000);
        t.setName("MyT");
       // t.setDaemon(true);


    }
}