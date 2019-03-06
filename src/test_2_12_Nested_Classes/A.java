package test_2_12_Nested_Classes;

public class A {
    int a = 1;
    final int e = 2;
A(){


}


    void printA() {
        System.out.println(a + "b" + "c" + e);
        class D {
            int d = 3;

            void test() {
                System.out.println(a + "b" + "c" + d + e);
            }
        }
    }

    static class B {
        int b = 1;

        void printB() {
            A aaa = new A();
            //  C ccc= new C();
            System.out.println(aaa.a + b + "c" + "e");
        }

    }

    private class C {
        int c = 1;

        void printC() {
            A aaa = new A();
            B bbb = new B();
            class G {
                void test() {
                    System.out.println(a + "b" + c + "d" + e);
                }
            }
            System.out.println(a + bbb.b + c + "d" + e);
        }
    }


}


