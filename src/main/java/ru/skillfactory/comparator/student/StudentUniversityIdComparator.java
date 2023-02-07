package ru.skillfactory.comparator.student;

import org.apache.commons.lang3.StringUtils;
import ru.skillfactory.model.Student;

public class StudentUniversityIdComparator implements StudentComparator {

    @Override
    public int compare(Student student1, Student student2) {
//        return student1.getUniversityId().compareTo(student2.getUniversityId());
        return StringUtils.compare(student1.getUniversityId(), student2.getUniversityId());
    }
}
