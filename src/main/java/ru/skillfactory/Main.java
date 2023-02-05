package ru.skillfactory;

import ru.skillfactory.model.Student;
import ru.skillfactory.model.StudyProfile;
import ru.skillfactory.model.University;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Ветрова Карина Германовна",
                "101", 3, 4.1f);

        University university1 = new University(
                "101",
                "Университет Компьютерных наук и актерского мастерства",
                "УКНАК", 1991, StudyProfile.COMPUTER_SCIENCE);

        System.out.println(student1);
        System.out.println(university1);

    }
}