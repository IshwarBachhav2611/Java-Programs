public class ArrayAddtion {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int add = 0;
        for (int i : arr) {
            add += i;   
        }
        System.out.println("Addtion Of Array Elements :"+add);
    }   
}
