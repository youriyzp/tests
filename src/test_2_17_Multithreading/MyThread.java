package test_2_17_Multithreading;

public class MyThread extends Thread {
    public MyThread(String name){
        this.setName(name);
    }
    public void  run(){
        try {
            sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        play();
        //System.out.println("Burp!");
    }
    private void play(){
        System.out.println(getName());
        System.out.println(getName());
    }

    public static void main(String[] args) throws  InterruptedException {
        Thread tableThread =new MyThread("Table");
        Thread tenisThread =new MyThread("Tenis");
        tableThread.start();
        tenisThread.start();
//        System.out.println("Eat!");
//        myThread.join();
//        System.out.println("Run!");

    }

}
