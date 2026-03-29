public class ConstructorOverloading {
    ConstructorOverloading(){
        System.out.println("Constructor With Two Parameters..!");
    }
    ConstructorOverloading(int a){
        System.out.println("Constructor with One Parameter a:"+a);
    }  
    ConstructorOverloading(int b,int c){
        System.out.println("Constructor With Two Parameters b,c :"+b+","+c);
    }

    public static void main(String[] args){
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(10);
        ConstructorOverloading obj3 = new ConstructorOverloading(10,20);
        
    }
}
