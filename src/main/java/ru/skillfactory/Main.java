package ru.skillfactory;

import ru.skillfactory.model.Student;
import ru.skillfactory.model.University;
import ru.skillfactory.reader.XLSXReader;

import java.util.List;

public class Main {

    public static final String PATH = "src/main/resources/universityInfo.xlsx";

    public static void main(String[] args) {
        List<Student> students = XLSXReader.readStudents(PATH);
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("-----");

        List<University> universities = XLSXReader.readUniversities(PATH);
        for (University university : universities) {
            System.out.println(university);
        }
    }
}
