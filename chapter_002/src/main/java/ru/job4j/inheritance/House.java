package ru.job4j.inheritance;

public class House {
    private Builder builder;
    private Project project;

    private void build(Builder builder, Project project) {
        this.builder = builder;
        this.project = project;
    }

}
