package ru.job4j.inheritance;

public class Doctor extends Profession {
    public Doctor() {
        name = "Dr. Aibolit";
    }

    public Diagnose heal(Pacient pacient) {
        return new Diagnose(this, pacient);
    }
}
