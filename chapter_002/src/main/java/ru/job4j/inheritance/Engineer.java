package ru.job4j.inheritance;

public class Engineer extends Profession {
    public Engineer() {
        this.name = "Enginer";
    }

    public void draw(Project project) {
        System.out.println(name + " draw a drawing");
    }
}


