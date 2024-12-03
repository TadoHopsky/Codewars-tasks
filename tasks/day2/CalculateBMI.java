package tasks.day2;
/*
        Write function bmi that calculates body mass index (bmi = weight / height2).
        Напишите функцию bmi, которая вычисляет индекс массы тела (bmi = вес / рост2).

            if bmi <= 18.5 return "Underweight"
            if bmi <= 25.0 return "Normal"
            if bmi <= 30.0 return "Overweight"
            if bmi > 30 return "Obese"
 */

public class CalculateBMI {
    public static void main(String[] args) {
        System.out.println(bmi(80, 1.80));
    }

    public static String bmi(double weight, double height) {
        double res = weight / Math.pow(height, 2);
        if (res <= 18.5) {
            return "Underweight";
        } else if (res <= 25.0) {
            return "Normal";
        } else if (res <= 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
