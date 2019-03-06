package test_polimomorphizm.animal.base;

public class Sub extends Base {
    public String name = "Sub";


    public String getName() {
        return name;
    }

    public static void main(String[] args) {
Sub s= new Sub();
Base b = s;
        System.out.println(s.getName()+" "+ b.getName());
    }
}

