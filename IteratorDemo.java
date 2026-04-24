import java.util.ArrayList;
import java.util.*;
class IteratorDemo{
    public static void main(String[] args){
        ArrayList<String> obj = new ArrayList<>();
        obj.add("ishwar");
        obj.add("shubham");
        obj.add("Ritesh");
        obj.add("Jayesh");
        Iterator<String> it = obj.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }        
    }
}