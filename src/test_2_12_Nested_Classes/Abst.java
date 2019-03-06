package test_2_12_Nested_Classes;

abstract class Abst {
    abstract Abst mm();

}
class Outer{
    Abst mm(){
        class Inner extends  Abst {
            Abst mm(){
                System.out.println("Inner");
                return new Inner();

            }
        }
        return new Inner();

    }
}
class Den{
    public static void main(String[] args) {
        Outer obj= new Outer();
        Abst aa= obj.mm();
        aa.mm();
    }
}