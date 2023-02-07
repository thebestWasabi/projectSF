package ru.skillfactory.reader;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import ru.skillfactory.model.Student;
import ru.skillfactory.model.StudyProfile;
import ru.skillfactory.model.University;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class XLSXReader {

    public static List<Student> readStudents(String path) {
        List<Student> students = new ArrayList<>();
        File file = new File(path);

        try (FileInputStream inputStream = new FileInputStream(file);
             XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {
            XSSFSheet sheetOfStudents = workbook.getSheet("Студенты");
            Iterator<Row> rowIterator = sheetOfStudents.iterator();
            rowIterator.next();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Student student = new Student();
                student.setUniversityId(row.getCell(0).getStringCellValue());
                student.setFullName(row.getCell(1).getStringCellValue());
                student.setCurrentCourseNumber((int) row.getCell(2).getNumericCellValue());
                student.setAvgExamScore((float) row.getCell(3).getNumericCellValue());
                students.add(student);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    public static List<University> readUniversities(String path) {
        List<University> universities = new ArrayList<>();
        File file = new File(path);

        try (FileInputStream inputStream = new FileInputStream(file);
             XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {
            XSSFSheet sheetOfUniversities = workbook.getSheet("Университеты");
            Iterator<Row> rowIterator = sheetOfUniversities.iterator();
            rowIterator.next();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                University university = new University();
                university.setId(row.getCell(0).getStringCellValue());
                university.setFullName(row.getCell(1).getStringCellValue());
                university.setShortName(row.getCell(2).getStringCellValue());
                university.setYearOfFoundation((int) row.getCell(3).getNumericCellValue());
                university.setMainProfile(StudyProfile.valueOf(StudyProfile.class, row.getCell(4).getStringCellValue()));
                universities.add(university);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return universities;
    }
}
