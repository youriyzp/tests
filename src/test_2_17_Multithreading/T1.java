package test_2_17_Multithreading;

 class T1 implements Runnable{
     public void run(){
         System.out.println("t1");
     }
}
class T2 extends Thread{
     public  void  run(){
         System.out.println("t2");
     }
}
