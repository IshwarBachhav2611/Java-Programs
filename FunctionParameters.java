class FunctionParameters{

    public void fun1(){
        System.out.println("Without parameter...!");
    }
    public void fun2(String msg){
        System.out.println("with "+msg+"...!");
    }

    public static void main(String[] args){
        FunctionParameters obj = new FunctionParameters();
        String msg ="parameter";
        obj.fun1();
        obj.fun2(msg);
    }
}