package org.launchcode.java.demos.lsn3classes1;

import java.util.*;

public class SchoolPractice {
    private static Object Student;

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private static void main(String[] args) {

        Student students = new Student("Sean", 1, 1, 4.0);
        System.out.println(students);

        System.out.println(students.getNumberOfCredits());
    }
}
