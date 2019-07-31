package ru.job4j.oop;

public class Jukebox {
    public static void main(String[] args) {
        Jukebox j = new Jukebox();
        j.mucis(1);
        j.mucis(2);
        j.mucis(3);
    }

    public void mucis(int position) {
        if (position == 1) {
            System.out.println("пусть бегут неуклюжа");
        } else if (position == 2) {
            System.out.println("спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }
}
