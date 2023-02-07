package ru.skillfactory.comparator.university;

import org.apache.commons.lang3.StringUtils;
import ru.skillfactory.model.University;

public class UniversityFullNameComparator implements UniversityComparator {

    @Override
    public int compare(University university1, University university2) {
        return StringUtils.compare(university1.getFullName(), university2.getFullName());
    }
}
