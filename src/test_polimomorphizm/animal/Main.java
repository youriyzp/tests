package test_polimomorphizm.animal;

public class Main {
    static int countOfCat=0;

    public static void main(String[] args) {
        Animal[]animals= {new  Cat(), new Dog(),new  Cat()};

        for (Animal a : animals
        ) {
            if (a instanceof Cat)
                countOfCat++;
        }
        System.out.println(countOfCat);
    }

}
