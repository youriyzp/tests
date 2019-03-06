package test_2_13_ENUM;

public class EnumCheck {
    public static void main(String[] args) {
        if(AnEnum.ONLY instanceof  AnEnum){
            System.out.println("yes,inst of AnEnum");
        }
        if(AnEnum.ONLY instanceof EnumeBase){
            System.out.println("yes,ins EnBas");
        }
        if(AnEnum.ONLY instanceof  Enum){//
            //THIRD_CHECK

            System.out.println("insofEnum");
        }
    }
}
