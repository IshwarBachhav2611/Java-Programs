class ConstructorParameter {
    ConstructorParameter(int a, int b){
        System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
    }
    
    public static void main(String[] args){
        ConstructorParameter obj = new ConstructorParameter(10, 20);
    }
}
