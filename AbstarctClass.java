abstract class Parent{
    abstract void msg();//function Declaration
}

class Child extends Parent{
    void msg(){
        System.out.println("Abstract Method Called...!");
    }
}

class AbstarctClass {
    public static void main(String[] args){
        Child obj = new Child();
        obj.msg();
    }    
}
