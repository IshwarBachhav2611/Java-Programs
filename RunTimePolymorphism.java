class Parent{
    public void msg(){
        System.out.println("Parent Class Message...!");
    }
}
class Child extends Parent{
    public void msg(){
        super.msg();
        System.out.println("Child Class message...!");
    }
}
class RunTimePolymorphism{
    public static void main(String[] args){
        Child obj = new Child();
        obj.msg();
    }
}