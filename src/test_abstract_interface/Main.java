package test_abstract_interface;

public class Main {
    public static void main(String[] args) {

        //  ошибка: ob1 = new A();
        B ob2 = new B(); // будет вызван конструктов по умолчанию из A
        ob2.print();
        A ob1;
        ob1 = (A) ob2; // явное приведение
        ob1.print();
    }
}
