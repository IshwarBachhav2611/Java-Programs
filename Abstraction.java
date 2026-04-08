abstract class Parent{
    public void msg(){
        System.out.println("This is parent Message...!");
    }
    abstract void msg2();
}
class Child extends Parent{
    void msg2(){
        System.out.println("Child class Msg...!");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.msg();
        obj.msg2();
    }
}
