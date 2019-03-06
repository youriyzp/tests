package test_2_17_Multithreading;

//public class Test extends  Thread{
public class  Test implements  Runnable{

    public void  run(){
      System.out.println("In run met" +Thread.currentThread().getName());
    }

    public static void main(String[] args) {
//        Thread myThread= new Test();
        Thread tread =new Thread(new Test());
        tread.run();
        tread.run();
        tread.start();
//        myThread.start();
//        myThread.start();
     //   printAll(args);

    }
//    public static void printAll(String[]lines){
//        for (int i=0; i<lines.length;i++){
//            System.out.println(lines[i]);
           // Thread.currentThread().sleep(1000);
      // }

    //}
}


