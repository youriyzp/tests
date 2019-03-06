package test_2_12_Nested_Classes;

class MyOuter {
    private int x=7;
   //String x = "Outer";

   // void doStaff() {

        class MyInner {
//   public void makeInner(){
//       MyInner in = new MyInner();
//       in.seeOuter();
//    }
//        class MyInner {
//           MyInner in = new MyInner();
//       in.seeOuter();

            public void seeOuter() {
                System.out.println("Outer x is " + x);
            }
        }
//        MyInner mi = new MyInner();
//        mi.seeOuter();
//    }

    // private int x=8;
//        public void seeOuter(){
//            System.out.println("x is" + x);
//        }
//    }

    public static void main(String[] args) {
//        MyInner inner= new MyOuter().new MyInner();
//        inner.seeOuter();
//       MyOuter myOuter= new MyOuter();
//       // myOuter.makeInner();
//        myOuter.doStaff();
       // makeinner();
//MyInner myInner= new MyInner();
//myInner.seeOuter();
    }
}
