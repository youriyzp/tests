package test_2_12_Nested_Classes;

public class Popcorn {
    public void pop(){
        System.out.println("popcorn");
    }
}
class  Food {
    Popcorn p= new Popcorn(){
        public void siz(){
            System.out.println("anon");
        }
        public void pop (){
            System.out.println("an pop");
        }
    };

    public static void main(String[] args) {
        Food food =new Food();
        food.p.pop();
      //  food.p.siz;

    }


}