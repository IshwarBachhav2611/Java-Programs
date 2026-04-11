import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java"); // ignored

        System.out.println(set);
    }
}