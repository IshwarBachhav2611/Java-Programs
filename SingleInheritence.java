class Parent{
    Parent(){
        System.out.println("This Is Parent Class");
    }
}
class SingleInheritence extends Parent{
    public static void main(String[] args) {
        Parent obj = new Parent();
    }
}