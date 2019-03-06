package test_2_16_Overload;

public class OverLoad {
    //  static void dojob(String s) {
//      System.out.println("String");
////  }
//      static void dojob(byte b){
//          System.out.println("byte");
//    }
////    static void dojob(byte ...x){
////        System.out.println("byte...x");
////    }
////    static void dojob(int x,int y){
////        System.out.println("int i,int y");
////    }
//    static void dojob(int i) {
//        System.out.println("int");
//    }
//
//    static void dojob(double f) {
//        System.out.println("double");
//    }
//    static void dojob(int i,double f){
//        System.out.println("int i,double f");
//    }
//    static void dojob(Byte b){
//          System.out.println("byte");
//    }
//static void dojob(long f) {
//    System.out.println("long");
//}
//    static void dojob(Double f) {
//        System.out.println("Double");
//    }
//        static void dojob(Long f) {
//    System.out.println("Long");
//}
    static void dojob(long ... f) {
    System.out.println("long...");
}
    static void dojob2(Integer ... f) {
        System.out.println("Integer...");
    }
    public static void main(String[] args) {
        int i=5;
        dojob(i,i);
        dojob2(i,i);

       //  dojob(5);
   // byte b=5;
   // dojob((byte)5);
//        short s= 5;
//        long l=5;
//        float f=5.0f;
   //  dojob(10f);
//        dojob(s);
//        dojob(l);
//        dojob(f);
        // OverLoad ot=new OverLoad();
        // ot.dojob("hello");
        //ot.dojob(3);
        // ot.dojob(3.5);
        //ot.dojob(5);
        //   ot.dojob(2,2.3);
        //  dojob("d");
        //dojob(1.0);
//        OverLoad d = new OverLoad();
//        d.test(new Integer(5));
//    }

//    void test(Long x) {
//        System.out.println("Long");
//    }
//
//    void test(Short x) {
//        System.out.println("Short");
//
    }
}
