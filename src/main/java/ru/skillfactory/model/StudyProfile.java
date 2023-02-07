package ru.skillfactory.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StudyProfile {

    COMPUTER_SCIENCE("Информатика"),
    MATHEMATICS("Математика"),
    RUSSIAN_LANGUAGE("Русский язык"),
    LITERATURE(" Литература"),
    ENGLISH("Английский язык"),
    PHYSICS("Физика"),
    MEDICINE("Медицина"),
    LINGUISTICS("Лингвистика");

    private final String profileName;

}
