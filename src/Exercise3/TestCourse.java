package Exercise3;

import java.util.Arrays;

public class TestCourse {
    public static void main(String[] args) {
        Course javaCourse = new Course("Java Programming");

        // Adding students
        javaCourse.addStudent("Ahmed");
        javaCourse.addStudent("Mohamed");
        javaCourse.addStudent("Fatima");

        System.out.println("Course: " + javaCourse.getCourseName());
        System.out.println("Number of students: " + javaCourse.getNumberOfStudents());
        System.out.println("Students: " + Arrays.toString(javaCourse.getStudents()));

        // Dropping a student
        System.out.println("\nDropping 'Mohamed'...");
        javaCourse.dropStudent("Mohamed");

        System.out.println("Number of students: " + javaCourse.getNumberOfStudents());
        System.out.println("Students: " + Arrays.toString(javaCourse.getStudents()));
    }
}