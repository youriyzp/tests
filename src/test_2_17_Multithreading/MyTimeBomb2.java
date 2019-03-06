package test_2_17_Multithreading;

public class MyTimeBomb2 implements Runnable {
    private int seconds;

    public MyTimeBomb2(int seconds) {
        this.seconds = seconds;
    }

    public void run() {
        try {
            for (int i = 0; i < this.seconds; i++) {
                Thread.sleep(1000);
                System.out.println(seconds - i);
            }
            System.out.println("Boom!");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("У нас проблемы с потоком");
        }

    }

    public static void main(String[] args) {
        MyTimeBomb2 bomb1 = new MyTimeBomb2(10);
        Thread thread = new Thread(bomb1);
        Thread thread1 = new Thread(bomb1);
        thread1.setName("TestYield");
        thread.setName("Bomb");
        thread.start();
        thread1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //thread.interrupt();
        //thread1.interrupt();
        System.out.println("Asta la vista, baby!");
    }

}

