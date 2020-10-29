package com.company.intrfaces;

import java.util.*;

public class Demo2 {

    public static void main(String[] args) {
        // ["helo", "abc", "123"]

        List<Integer> arrayList = new LinkedList<>();
        arrayList.add(10);
        arrayList.add(9);
        arrayList.add(8);
        arrayList.add(7);

        Collections.sort(arrayList);

        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        List<Student> students = new ArrayList<>();
        students.add(new Student("ion", 25));
        students.add(new Student("petru", 19));
        Collections.sort(students);


        Map<Integer, String> map = new HashMap<>();

        Set<Student> studentSet = new TreeSet<>();
        for(Student student: studentSet){

        }

        // Comparable cmp = students.get(0)
        for(Student s: students) {
            System.out.println(s.name);
        }
    }

}

class Student implements Comparable<Student> {
    String name;
    Integer age;
    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public int compareTo(Student s) {
        // 0 - =
        // -1000 <
        // ++++ >
        return this.age.compareTo(s.age);
    }
}