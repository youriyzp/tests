package test_2_14_Generic;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer,String> worldcup= new Pair<Integer,String>(2010,"sout Afrika");
        System.out.println("worldcup"+worldcup.getFirst()+"in"+worldcup.getSecond());
    }
}
