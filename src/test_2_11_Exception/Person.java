package test_2_11_Exception;

class Person {
}
class Father extends Person {
    public void dance() throws ClassCastException{}
}
class Home {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            ((Father) p).dance();
        } catch (NullPointerException e) {


        }
        catch (ClassCastException e){

        }
        catch ( Exception e){

        }
        catch (Throwable e){

        }
    }
}