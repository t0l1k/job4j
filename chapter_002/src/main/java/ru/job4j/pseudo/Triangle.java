package ru.job4j.pseudo;

public class Triangle implements Shape {
    @Override
    public String draw() {
        return new StringBuilder()
                .append("  ++")
                .append(" +  +")
                .append("+    +")
                .append("++++++")
                .toString();
    }
}
