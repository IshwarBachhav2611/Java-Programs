final class Msg{
    Msg(){
        System.out.println("This is the final class,");
        System.out.println("Final class Dose not Support Inheritence,");
        System.out.println("Means Can Not be Extended,");
        System.out.println("So, Directly Create Object of Final class to access All the Properties of the Class...!");
    }
}
public class FinalClass {
    public static void main(String[] args){
        Msg obj = new Msg();
    }
}
