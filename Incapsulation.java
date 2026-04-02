class Incapsulation{
    private String Name;

    public void setName(String name){
        this.Name = name;
    }

    public void getName(){
        System.out.println("Name :"+Name);
    }

    public static void main(String[] args){
        Incapsulation obj = new Incapsulation();
        obj.setName("Ishwar Bachhav");
        obj.getName();
    }
}