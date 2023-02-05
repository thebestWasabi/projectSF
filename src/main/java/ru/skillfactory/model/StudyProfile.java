package ru.skillfactory.model;

public enum StudyProfile {

    COMPUTER_SCIENCE("Информатика"),
    MATHEMATICS("Математика"),
    RUSSIAN_LANGUAGE("Русский язык"),
    LITERATURE(" Литература"),
    ENGLISH("Английский язык");

    private String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}
