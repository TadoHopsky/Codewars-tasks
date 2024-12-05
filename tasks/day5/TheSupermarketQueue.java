package tasks.day5;

/*
            An isogram is a word that has no repeating letters, consecutive or non-consecutive.
            Implement a function that determines whether a string that contains only letters is an isogram.
            Assume the empty string is an isogram. Ignore letter case.
========================================================================================================================
            Изограмма - это слово, которое не имеет повторяющихся букв, последовательных или не последовательных.
            Реализовать функцию, которая определяет, является ли строка, содержащую только буквы, изограммой.
            Предположим, что пустая строка - это изограмма. Не обращайте внимания на письмо.
 */

public class TheSupermarketQueue {
    public static void main(String[] args) {
        System.out.println(isIsogram("isogram"));
    }

    public static boolean  isIsogram(String str) {
        String lowerCaseWord = str.toLowerCase();
        long uniqLetter = lowerCaseWord
                .chars()                                  // Преобразуем строку в поток символов.
                .distinct()                               // Убираем все повторяющиеся символы.
                .count();                                 // Считаем количество уникальных символов.

        return str.length() == uniqLetter;
    }
}
