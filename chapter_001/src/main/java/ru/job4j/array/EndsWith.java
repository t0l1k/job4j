package ru.job4j.array;

/**
 * Обертка над строкой.
 */
public class EndsWith {

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param post префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean endsWith(String word, String post) {
        // проверить. что массив data имеет первые элементы одинаковые с value
        return word.endsWith(post);
    }
}