package ru.skillfactory.comparator.university;

import org.apache.commons.lang3.StringUtils;
import ru.skillfactory.model.University;

public class UniversityIdComparator implements UniversityComparator {

    @Override
    public int compare(University university1, University university2) {
        return StringUtils.compare(university1.getId(), university2.getId());
//        return String.CASE_INSENSITIVE_ORDER.compare(o1.getId(), o2.getId());
    }
}
