package test_2_15_Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Mix {
    public static void main(String[] args) {
        Object o= new Object();
        Set s=new HashSet();
      // TreeSet s= new TreeSet();
        //LinkedHashSet s= new LinkedHashSet();

        s.add(o);
        s.add("o");
        System.out.println(o.toString());

    }
}
