package test_2_13_ENUM;

public class TestDay {
    public enum Days{MO,TU,WE};

    public static void main(String[] args) {
        for(Days d:Days.values());
        Days[]d2=Days.values();
        System.out.println(d2[2]);
    }
}
