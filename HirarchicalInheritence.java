class Parent{
    public String Name;
}
class Child1 extends Parent{
    Child1(String Name){
        this.Name = Name;
        System.out.println("Name in Child1 :"+Name);
    }
}
class Child2 extends Parent{
    Child2(String Name){
        this.Name = Name;
        System.out.println("Name in Child2 :"+Name);
    }
}
class Child3 extends Parent{
    Child3(String Name){
        this.Name = Name;
        System.out.println("Name in Child3 :"+Name);
    }
}

class HirarchicalInheritence{
    public static void main(String[] args){
        Child1 c1 = new Child1("Ishwar");
        Child2 c2 = new Child2("Jayesh");
        Child3 c3 = new Child3("Ritesh");
    }
}