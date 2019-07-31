package ru.job4j.inheritance;

public class Engineer extends Profession {
    public static void main(String[] args) {
        Engineer e = new Engineer();
        System.out.println(e);
    }

    public void work() {
        System.out.println("engineer work");
    }
}


