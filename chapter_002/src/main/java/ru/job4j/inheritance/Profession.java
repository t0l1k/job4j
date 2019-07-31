package ru.job4j.inheritance;

import java.util.Date;

public class Profession {
    protected String name;
    protected String surname;
    protected String education;
    protected Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public static void main(String[] args) {
        Profession p = new Profession();
        p.setName("test");
        System.out.println(p);
    }

    @Override
    public String toString() {
        return name;
    }
}

