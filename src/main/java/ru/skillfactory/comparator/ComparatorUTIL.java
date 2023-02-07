package ru.skillfactory.comparator;

import lombok.NoArgsConstructor;
import ru.skillfactory.comparator.student.*;
import ru.skillfactory.comparator.university.*;


public class ComparatorUTIL {

    private ComparatorUTIL() {
    }

    public static StudentComparator getStudentComparator(StudentComparatorOfVariants variants) {
        switch (variants) {
            case FULL_NAME -> {
                return new StudentFullNameComparator();
            }
            case UNIVERSITY_ID -> {
                return new StudentUniversityIdComparator();
            }
            case CURRENT_COURSE_NUMBER -> {
                return new StudentCurrentCourseNumberComparator();
            }
            case AVG_EXAM_SCORE -> {
                return new StudentAvgExamScoreComparator();
            }
            default -> {
                return new StudentFullNameComparator();
            }
        }
    }

    public static UniversityComparator getUniversityComparator(UniversityComparatorOfVariants variants) {
        switch (variants) {
            case ID -> {
                return new UniversityIdComparator();
            }
            case FULL_NAME -> {
                return new UniversityFullNameComparator();
            }
            case SHORT_NAME -> {
                return new UniversityShortNameComparator();
            }
            case YEARS_OF_FOUNDATION -> {
                return new UniversityYearOfFoundationComparator();
            }
            case MAIN_PROFILE -> {
                return new UniversityStudyProfileComparator();
            }
            default -> {
                return new UniversityIdComparator();
            }
        }
    }
}
