/*
        Clock shows h hours, m minutes and s seconds after midnight.
        Your task is to write a function which returns the time since midnight in milliseconds.
========================================================================================================================
        Часы показывают h-часы, m-минуты и s-секунды после полуночи.
        Ваша задача состоит в том, чтобы написать функцию, которая возвращает время с полуночи в миллисекундах.
        Example:
        h = 0 | m = 1 | s = 1
        result = 61000
 */

public class BeginnerSeries2Clock {
    public static void main(String[] args) {
        System.out.println(past(0, 1, 1));
    }

    public static int past(int h, int m, int s) {
        return 1000 * ((h * 60 * 60) + (m * 60) + s);
    }
}
