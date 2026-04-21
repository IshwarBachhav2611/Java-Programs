import java.util.HashMap;

class HashMapDemo{
    public static void main(String[] args){
        HashMap<Integer,String> obj = new HashMap<>();
        obj.put(1, "Ishwar");
        obj.put(2, "Shubahm");
        obj.put(3,"Ritesh");
        obj.put(4,"jayesh");
        obj.put(5,"Umesh");

        for(int i=1; i<=obj.size(); i++){
            System.out.println("Key :"+i+" Value :"+obj.get(i));
        }
        
        System.out.println("\nBefore Replace :"+obj.get(3));
        obj.replace(3,"Dipak");
        System.out.println("After Replace :"+obj.get(3));
        
        System.out.println("\nSize of HashMap :"+obj.size());
        System.out.println("All Kays :"+obj.keySet());
        System.out.println("All Values :"+obj.values());
    }
}