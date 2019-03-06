package test_2_15_Collection;

import java.util.HashMap;
import java.util.Map;

public class AcMan {
    private Map accountTotal =new HashMap();
    private int retire;
    public  int getBal(String acName){
        Integer total= (Integer)accountTotal.get(acName);

        if (total==null)
            total=Integer.valueOf(0);
        return  total.intValue();


    }
public void setBalance(String acName,int amount){
        accountTotal.put(acName,Integer.valueOf(amount));

}

}
