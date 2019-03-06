package test_2_17_Multithreading;

public class Morecombe {
    public static void main(String[] args) {
        Morecombe  m= new Morecombe();
        m.go(new Turing(){});

    }

    public  void  go (Turing t) {
        t.start();

    }
}
class Turing extends Thread{
    public  void run(){
        for (int i=0;i<2;i++ ){
            System.out.println(i);
        }
    }
}