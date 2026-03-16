public class FunctionOverloading {
    
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b, double c){
        return a+b+c;
    }
    public static void main(String[] args){
        FunctionOverloading fn = new FunctionOverloading();
        System.out.println("Add1 :"+fn.add(10, 20));
        System.out.println("Add2 :"+fn.add(10, 20, 30));
    }
}
