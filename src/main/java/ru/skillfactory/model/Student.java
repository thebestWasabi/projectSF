package ru.skillfactory.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private String fullName;
    private String universityId;
    private int currentCourseNumber;
    private float avgExamScore;

}
