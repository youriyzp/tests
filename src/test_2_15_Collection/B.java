package test_2_15_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class B {
    public static class Main {
        public static void main(String[] args) {




            ArrayList<Integer> a = new ArrayList<Integer>();
            a.add(1);
            a.add(5);
            a.add(3);

            Collections.sort(a);
            for (int s :a) {
                System.out.println(s + " ");
            }
        }
    }
}