package com.multilevel.schoolmanagement;

public class School {

    private final String schoolName;

    public School(String schoolName) {
        validateSchoolName(schoolName);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    private static void validateSchoolName(String schoolName) {
        if (schoolName == null || schoolName.isBlank()) {
            throw new IllegalArgumentException(
                    "School name cannot be empty");
        }
    }
}