package pl.sdacademy.thinkingisfun;

import java.util.Arrays;

public class ArraysAreFun {
    public Integer[] merge(Integer[] first, Integer[] second) {
        if (first.length == 0) {
            return second;
        }
        if (second.length == 0) {
            return first;
        }

        Integer[] sum = new Integer[first.length + second.length];
        int f = 0;
        int s = 0;

        for (int i = 0; i < sum.length; i++) {
            if (f < first.length && s < second.length) {
                if (first[f] > second[s]) {
                    sum[i] = second[s];
                    s++;
                } else if (first[f] < second[s]) {
                    sum[i] = first[f];
                    f++;
                } else {
                    sum[i] = first[f];
                    f++;
                    sum[++i] = second[s];
                    s++;
                }
            } else if (f == first.length) {
                sum[i] = second[s];
                s++;
            } else {
                sum[i] = first[f];
                f++;
            }
        }
        System.out.println(Arrays.toString(sum));
        return sum;
    }

    public Integer[] reverse(Integer[] array) {
        return new Integer[0];
    }

    public Integer[] roll(Integer[] array, int amount) {
        return new Integer[0];
    }

    public Integer[] longestGrowingTrent(Integer[] array) {
        return new Integer[0];
    }
}
