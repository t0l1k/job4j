package ru.job4j.inheritance;

public class Doctor extends Profession {

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Diagnose heal(Pacient pacient) {
        return new Diagnose();
    }
}
