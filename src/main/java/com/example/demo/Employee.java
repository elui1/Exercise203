package com.example.demo;

public class Employee {
    private String firstName;
    private String lastName;
    private String socSecNum;
    private String birthDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocSecNum() {
        return socSecNum;
    }

    public void setSocSecNum(String socSecNum) {
        this.socSecNum = socSecNum;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
