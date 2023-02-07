package ru.skillfactory.comparator.university;

import org.apache.commons.lang3.StringUtils;
import ru.skillfactory.model.University;

public class UniversityStudyProfileComparator implements UniversityComparator {

    @Override
    public int compare(University university1, University university2) {
        if (university1.getMainProfile() == null)
            return 1;
        else if (university2.getMainProfile() == null)
            return -1;
        return StringUtils.compare(university1.getMainProfile().name(), university2.getMainProfile().name());
    }
}
