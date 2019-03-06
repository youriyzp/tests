package test_abstract_interface;

abstract class A {
    int p1;
    A() {
        p1 = 1;
    }
    void print() {
        System.out.println(p1);
    }
}
class B extends A {
}
