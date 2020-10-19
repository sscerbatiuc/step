package com.company.enums;

public enum Gender {
    MALE(65, "Test"),
    FEMALE(60, "Test");

    private Integer pensionAge;
    private Gender(Integer pension, String attr){
        this.pensionAge = pension;
    }

    public Integer getPensionAge() {
        return this.pensionAge;
    }
}
