import java.util.LinkedList;
import java.util.ListIterator;

class ListIteratorDemo{
    public static void main(String[] args){
        LinkedList<Integer> obj = new LinkedList<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
    
        ListIterator<Integer> lit = obj.listIterator();
        System.out.println("Assending :");
        while(lit.hasNext()){
            System.out.print(lit.next()+" ");
        }
        System.out.println("\nDesending :");
        while(lit.hasPrevious()){
            System.out.print(lit.previous()+" ");
        }
        
    }
}