public class NestedClass {
    public class  Class1 {
        Class1(){
            System.out.println("Class 1 ...!");
        }       
    }
    public class Class2{
        Class2(){
            System.out.println("Class 2...!");
        }
    }

    public static void main(String[] args){
        NestedClass outer = new NestedClass();
        NestedClass.Class1 obj1 = outer.new Class1();
        NestedClass.Class2 obj2 = outer.new Class2();
    }
}
