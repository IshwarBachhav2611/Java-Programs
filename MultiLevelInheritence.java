class Grandpa{
    public void Display1(){
        System.out.println("This is Grandpa...!");
    }
}
class Father extends Grandpa{
    public void Display2(){
        System.out.println("This is Father...!");
    }
}
class Child extends Father{
    public void Display3(){
        System.out.println("This is Child...!");
    }
}
public class MutilLevelInheritence {
    public static void main(String[] args){
        Child obj = new Child();
        obj.Display1();
        obj.Display2();
        obj.Display3();
    }
}
