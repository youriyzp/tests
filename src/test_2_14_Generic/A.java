package test_2_14_Generic;

import java.util.Arrays;
import java.util.List;

public  class A {
    public static <T> T getValue(Object obj, Class<T> clazz) {
        return (T) obj;
    }
    public static <T> T getValue(Object obj) {
        return (T) obj;
    }


    public static void main(String []args) {
        List list = Arrays.asList("Author", "Book");
        for (Object element : list) {
            String data = A.getValue(element, String.class);
            System.out.println(data);
            System.out.println(A.<String>getValue(element));
        }
    }
}
