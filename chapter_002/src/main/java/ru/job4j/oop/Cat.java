package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Гав");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.show();
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.printf("Имя котика %s и он сьел %s\n", this.name, this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }
}