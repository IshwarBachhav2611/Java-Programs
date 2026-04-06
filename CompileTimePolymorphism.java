class Demo{
    public void add(int a, int b){
        System.out.println("Addition :"+(a+b));
    }

    public void add(int a, int b,int c){
        System.out.println("Addition :"+(a+b+c));
    }
}
class CompileTimePolymorphism{
    public static void main(String[] srgs){
        Demo obj = new Demo();
        obj.add(10,20);
        obj.add(10, 20, 30);
    }
}