package ru.job4j.condition;

public class DummyBot {
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        String hi = "Привет, умник.";
        String bye = "До скорой встречи.";
        if ("Привет, Бот.".equals(question)) {
            rsl = hi;
        } else if ("Пока.".equals(question)) {
            rsl = bye;
        }
        return rsl;
    }
}