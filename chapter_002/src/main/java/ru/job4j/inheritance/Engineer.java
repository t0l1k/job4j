package ru.job4j.inheritance;

public class Engineer extends Profession {

    public Engineer(String name) {
        super(name);
    }

    public void draw(Project project) {
        System.out.println(getName() + " draw a drawing");
    }
}