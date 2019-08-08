package ru.job4j.inheritance;

public class Diagnose {
    Doctor doctor = new Doctor();
    Pacient pacient = new Pacient();

    public Diagnose(Doctor doctor, Pacient pacient) {
        this.doctor = doctor;
        this.pacient = pacient;
    }
}
