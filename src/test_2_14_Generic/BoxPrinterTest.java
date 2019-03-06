package test_2_14_Generic;

public  class BoxPrinterTest{
    public static void main(String[] args) {
        BoxPrinter<Integer> value1=new BoxPrinter<Integer>(new Integer(10));
       // Integer intValue1=value1.getValue();
        System.out.println(value1);
//        BoxPrinter<String>value2=new BoxPrinter<String>("HelloWorld");
//       // Integer intValue2=value2.getValue();
//        System.out.println(value2.getValue());

    }


}
