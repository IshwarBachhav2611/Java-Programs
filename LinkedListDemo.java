import java.util.*;
class LinkedListDemo{
    public static void main(String[] args){
        LinkedList<Integer> obj = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Elements :");
        int num = sc.nextInt();    

        for(int i=0; i<num; i++){
            int element = sc.nextInt();
            obj.add(element);
        }
        System.out.println("LinkedList :"+obj);
        System.out.println("getFirst:"+obj.getFirst());
        System.out.println("getLast:"+obj.getLast());
    }
}