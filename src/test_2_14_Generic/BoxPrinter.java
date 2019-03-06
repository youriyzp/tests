package test_2_14_Generic;



 class BoxPrinter<T> {
    // private String val;
    private T val;
    public BoxPrinter(T arg){
        val=arg;

    }
    public String toString(){
        return "{"+val+"}";
    }
//    public T getValue(){
//        return  val;
//
//    }
}
