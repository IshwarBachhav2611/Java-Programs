class Parent{
    Parent(){
        System.out.println("This is the Parent Constructor...!");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("This is the Chile Constuctor...!");
    }
}
class InheritConstructor {
    public static void main(String[] args){
        Child obj = new Child();
    }    
}