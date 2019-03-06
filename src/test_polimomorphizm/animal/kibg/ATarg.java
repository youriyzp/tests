package test_polimomorphizm.animal.kibg;

public class ATarg extends King{
    private String victimName;
    ATarg(){
        System.out.println("Call ATARG Con");
        victimName= "lyana";
        speech();
    }
@Override
    public  void speech (){
    System.out.println("Burn"+victimName+"!");
}
}
