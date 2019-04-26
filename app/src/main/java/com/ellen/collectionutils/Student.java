package com.ellen.collectionutils;

import com.ellen.collectionutils.collectionutil.ArrangeInterface;
import com.ellen.collectionutils.collectionutil.CompareableInterface;

public class Student implements CompareableInterface<Student>, ArrangeInterface<Student> {

    int age;
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        return student.age - this.age;
    }

    @Override
    public boolean identical(Student student) {
        return this.name.equals(student.name);
    }
}
