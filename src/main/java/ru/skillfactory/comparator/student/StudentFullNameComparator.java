package ru.skillfactory.comparator.student;

import org.apache.commons.lang3.StringUtils;
import ru.skillfactory.model.Student;

public class StudentFullNameComparator implements StudentComparator {

    @Override
    public int compare(Student student1, Student student2) {
//        return student1.getFullName().compareTo(student2.getFullName());
        return StringUtils.compare(student1.getFullName(), student2.getFullName());
    }
}
