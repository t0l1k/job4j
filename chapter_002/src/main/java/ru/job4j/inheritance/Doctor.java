package ru.job4j.inheritance;

public class Doctor extends Profession {
    public Doctor(String name) {
        super(name);
    }

    public Diagnose heal(Pacient pacient) {
        return new Diagnose(this, pacient);
    }
}
