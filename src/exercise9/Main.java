package exercise9;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Course java = new Course("java");
        java.addStudent("Dan");
        java.addStudent("Boris");
        java.addStudent("Anton");
        java.dropStudent("Anton");
        System.out.println(Arrays.toString(java.getStudents()));
    }
}
