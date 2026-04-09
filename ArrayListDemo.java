import java.util.*;
class ArrayListDemo{
    public static void main(String[] args){
        ArrayList<Integer> obj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. of Elements :");
        int num = sc.nextInt();    

        for(int i=0; i<num; i++){
            int element = sc.nextInt();
            obj.add(element);
        }
        System.out.println("Array List :"+obj);
    }
}