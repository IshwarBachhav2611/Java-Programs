class StaticClass{
    static String msg = "Hello";//static member of outer class
    // static inner class
    static class Inner{
        void show(){
            System.out.println("Inner Static Class...!"+msg);
        }
    }

    public static void main(String[] args){
        Inner obj = new Inner();//no need to create object of outer class
        obj.show();
    }
}