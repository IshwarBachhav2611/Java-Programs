class BasicClass{
    // Data Members
    String name = "ishwar";
    int Age = 22;

    //Member Functions
    public void print(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+Age);
    }

    public static void main(String[] args) {
        BasicClass obj = new BasicClass();
        obj.print();
    }
}