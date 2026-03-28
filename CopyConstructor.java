class CopyConstructor{
    String name;
    CopyConstructor(String name){
        this.name = name;
    }

    CopyConstructor(CopyConstructor obj){
        this.name = obj.name;
    }

    public static void main(String[] args){
        CopyConstructor obj1 = new CopyConstructor("ishwar");
        CopyConstructor obj2 = new CopyConstructor(obj1);
        System.out.println("Printing Name :"+obj2.name);

    }
}