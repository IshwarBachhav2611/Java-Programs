import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // add()
        set.add("Java");
        set.add("Python");
        set.add("Java"); // duplicate ignored

        System.out.println("Set: " + set);

        // contains()
        System.out.println("Contains Java: " + set.contains("Java"));

        // remove()
        set.remove("Python");
        System.out.println("After remove: " + set);

        // size()
        System.out.println("Size: " + set.size());

        // isEmpty()
        System.out.println("Is Empty: " + set.isEmpty());
    }
}