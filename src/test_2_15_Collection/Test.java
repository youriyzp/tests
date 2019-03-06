package test_2_15_Collection;



import java.util.*;

public class Test {

public  static void  before() {
    //public static <T>List<?>asList1(T...elements){
//    Set set = new TreeSet();
//    set.add("2");
//    set.add(1);
//    set.add("3");
//    Iterator it=set.iterator();
//    while (it.hasNext())
//        System.out.println(it.next()+" ");
}


    public static void main(String[] args) {
        Set <Integer>set = new TreeSet<Integer>();
        set.add(5);
        set.add(10);
        set.add(3);
        set.add(5);
//        Iterator it=set.iterator();
//        while (it.hasNext())
//            System.out.println(it.next()+" ");
        System.out.println(set);
    }
       // System.out.println(set);

        //asList1().add(1);
  //  }
}
