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
        boolean result = true;
        char[] pst = post.toCharArray();
        char[] wrd = word.toCharArray();
        // проверить. что массив data имеет первые элементы одинаковые с value
        for (int i = 0; i < post.length(); i++) {
            if (wrd[wrd.length - pst.length + i] != pst[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}