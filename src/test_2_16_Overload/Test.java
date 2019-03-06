package test_2_16_Overload;

public class Test {
    String invade(short ships){
        return "a few";
    }
    String invade (byte...ships){
        return "many";
    }

}
class Defender{
    public static void main(String[] args) {
        System.out.println(new Test().invade((byte)7));
    }
}
