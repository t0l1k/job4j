package ru.job4j.inheritance;

public class Builder extends Engineer {
    private Project project;

    public Builder() {
        name = "Builder";
    }

    public void build(Project project) {
        this.project = project;
    }
}
