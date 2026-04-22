import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args){
        LinkedHashMap<Integer,String> obj = new LinkedHashMap<>();
        obj.put(1,"Ishwar");
        obj.put(2,"Shubham");
        obj.put(3, "Ritesh");
        obj.put(4,"Jayesh");
        obj.put(5,"Umesh");

        System.out.println("LinkedHashMap :"+obj);
        for(int i=0;i<obj.size();i++){
            System.out.println("Key :"+i+" Value :"+obj.get(i));
        }
        System.out.println("All Keys :"+obj.keySet());
        System.out.println("All Values :"+obj.values());
        System.out.println("isEmpty :"+obj.isEmpty());
        obj.replace(5, "Dipak");
        System.out.println("Replace key :5 value :"+obj.get(5));
        obj.clear();
        System.out.println("isEmpty :"+obj.isEmpty());
        System.out.println("LinkedHashSet :"+obj);
    }    
}
