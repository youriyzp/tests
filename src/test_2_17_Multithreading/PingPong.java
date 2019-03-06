package test_2_17_Multithreading;

public class PingPong {

        public synchronized static void main(String[] args) {
            Thread aThread = new Thread() {
                public void run() {
                    pong();
                }
            };
            aThread.run();
            System.out.println("Ping");

        }
     static    synchronized void pong(){
         System.out.println("Pong");
     }

}