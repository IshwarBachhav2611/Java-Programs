import java.util.*;

class Student implements Comparable<Student> {

    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.age - s.age; // ascending
    }
}

public class ComparableDemo {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(22, "Ishwar"));
        list.add(new Student(20, "Rahul"));
        list.add(new Student(25, "Amit"));

        Collections.sort(list);

        for(Student s : list){
            System.out.println(s.age + " " + s.name);
        }
    }
}