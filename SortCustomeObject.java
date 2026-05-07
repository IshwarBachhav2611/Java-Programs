import java.util.*;

class Student {
    int age;
    String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }
}

public class SortCustomeObject {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(22, "Ishwar"));
        list.add(new Student(20, "Rahul"));
        list.add(new Student(25, "Amit"));

        // Sorting using Comparator
        Collections.sort(list, (a, b) -> a.age - b.age);

        for(Student s : list){
            System.out.println(s.age + " " + s.name);
        }
    }
}