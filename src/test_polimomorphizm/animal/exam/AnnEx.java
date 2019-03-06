package test_polimomorphizm.animal.exam;

//import  static certif.ExamQ.mark;
class Car {
    public Car() {
        //System.out.println("Car Co 1");

    }

    public Car(long id) {
        System.out.println("Car Co 2");
    }

}
class  SportCar extends Car{
    public  SportCar(long id){
        System.out.println("SportCar Co 3");
    }
}
public class AnnEx {
    public static void main(String[] args) {
        SportCar  myCar = new SportCar(1);

    }
}

