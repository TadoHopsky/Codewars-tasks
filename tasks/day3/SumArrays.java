package tasks.day3;

import java.util.Arrays;

public class SumArrays {
    public static void main(String[] args) {
        System.out.println(sum(new double[]{-2.398}));
    }

    public static double sum(double[] numbers) {
//        double res = 0;
//        for(double d : numbers){res += d;}
//        return res;
//  ==========================================
        return Arrays.stream(numbers).sum();
    }
}


