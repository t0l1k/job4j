package ru.job4j.inheritance;

public class Doctor extends Profession {
    String name = "Doctor";

    public Diagnose heal(Pacient pacient) {
        return new Diagnose();
    }
}
