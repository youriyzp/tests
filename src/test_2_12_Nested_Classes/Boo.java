package test_2_12_Nested_Classes;

public class Boo {
    Boo(String S){}
    Boo(){}
}
class Bar extends Boo{
    Bar(){}
    Bar(String s){
        super(s);
    }
    void zoo(){
        Boo f= new Bar(){};
    }
}