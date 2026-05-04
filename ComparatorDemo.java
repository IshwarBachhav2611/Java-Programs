import java.util.*;

class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class NameComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(22, "Ishwar"));
        list.add(new Student(20, "Rahul"));
        list.add(new Student(25, "Amit"));

        Collections.sort(list, new NameComparator());

        for(Student s : list){
            System.out.println(s.name + " " + s.age);
        }
    }
}