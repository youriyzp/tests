//package test_2_11_Exception;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class Print {

//    void go(){
//        int x=1;
//         boolean b = true;
//         assert (x==1);
//
//    }
//
//    void print(Object s) {
//        if (s == null) {
//            throw new NullPointerException("Exception: s is null!");
//        }
//        System.out.println("Inside method print: " + s);
//    }
//
//    public static void main(String[] args) {
//        Print print = new Print();
//        List list= Arrays.asList("first step", null, "second step");
//
//        for (Object s:list) {
//            try {
//                print.print(s);
//            }
//            catch (NullPointerException e) {
//                System.out.println(e.getMessage());
//                System.out.println("Exception was processed. Program continues");
//            }
//            finally {
//                System.out.println("Inside bloсk finally");
//            }
//            System.out.println("Go program....");
//            System.out.println("-----------------");
//        }
//
//    }
   // static  String  s="";
//
//public static void main(String[] args) {
////    String [] student ={"she","Jo"};
//
//
////    try {
////        System.out.println(student[2]);
////
////    } catch (ArrayIndexOutOfBoundsException e){
////        System.out.println("Excep");
////    }
//
////
////    System.out.println("Alll");
//
//    boolean assertOn=false;
//    assert (assertOn):assertOn=true;
//    if(assertOn){
//        System.out.println("Assery is On");
//    }
//}
////}
//}