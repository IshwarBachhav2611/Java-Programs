class StaticFunctions{

    public static void funStatic(){
        System.out.println("This is the Static Function");
    }
    public void funNormal(){
        System.out.println("This is the normal function");
    }
    public static void main(String[] args){
        StaticFunctions sf = new StaticFunctions();
        sf.funNormal();
        funStatic();
    }
}