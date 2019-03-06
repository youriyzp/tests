package test_polimomorphizm.animal.casting;

public class CastingExample {
    public static void main(String[] args) {
        Monster mon1=new Dragon();
        Monster mo2=new Orc();
        ((Dragon) mon1).say();
        ((Orc)mo2).say();
    }
}
