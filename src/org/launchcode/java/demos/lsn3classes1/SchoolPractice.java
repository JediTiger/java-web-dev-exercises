package org.launchcode.java.demos.lsn3classes1;

import java.util.*;

public class SchoolPractice {
    private static Object Student;

    private static void main(String[] args) {

        Student students = new Student("Sean", 1, 1, 4.0);
        System.out.println(students);

        System.out.println(students.getNumberOfCredits());
    }
}
