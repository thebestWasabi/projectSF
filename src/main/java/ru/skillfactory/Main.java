package ru.skillfactory;

import ru.skillfactory.comparator.ComparatorUTIL;
import ru.skillfactory.comparator.StudentComparatorOfVariants;
import ru.skillfactory.comparator.UniversityComparatorOfVariants;
import ru.skillfactory.comparator.student.StudentComparator;
import ru.skillfactory.comparator.university.UniversityComparator;
import ru.skillfactory.model.Student;
import ru.skillfactory.model.University;
import ru.skillfactory.reader.XLSXReader;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static final String PATH = "src/main/resources/universityInfo.xlsx";

    public static void main(String[] args) {

        //Сортировка листа студентов по ФИО (по алфавиту)
        List<Student> students = XLSXReader.readStudents(PATH);
        StudentComparator studentComparator = ComparatorUTIL.getStudentComparator(StudentComparatorOfVariants.FULL_NAME);

        //Вывод отсортированного списка студентов сразу в стриме
        students.stream().sorted(studentComparator).forEach(System.out::println);

        System.out.println("-----");

        //Сортировка листа университетов по короткому имени
        List<University> universities = XLSXReader.readUniversities(PATH);
        UniversityComparator comparator = ComparatorUTIL.getUniversityComparator(UniversityComparatorOfVariants.SHORT_NAME);

        //Создал новый лист и положил туда отсортированный список университетов, потом вывел через ForEach
        List<University> newUniversityList = universities.stream().sorted(comparator).toList();
        for (University university : newUniversityList) {
            System.out.println(university);
        }
    }
}
