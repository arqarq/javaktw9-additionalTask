package pl.sdacademy.thinkingisfun;

import java.util.ArrayList;
import java.util.List;

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
        return sum;
    }

    public Integer[] reverse(Integer[] array) {
        Integer[] arrayInverted = new Integer[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            arrayInverted[(i - array.length + 1) * -1] = array[i];
        }
        return arrayInverted;
    }

    public Integer[] roll(Integer[] array, int amount) {
        while (amount != 0) {
            int tempF = array[0];
//            for (int i = 0; i < array.length - 1; i++) {
//                array[i] = array[i + 1];
//            }
            System.arraycopy(array, 1, array, 0, array.length - 1);
            array[array.length - 1] = tempF;
            amount--;
        }
        return array;
    }

    public Integer[] longestGrowingTrent(Integer[] array) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
//        Integer[] result = new Integer[array.length];
//        result[0] = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                result.add(array[i]);
//                result[r++] = i;
            } else {
                results.add(result);
                result = new Integer[array.length];
                r = 0;
            }
        }
        if (array[array.length - 2] < array[array.length - 1]) {
            result.add(array[array.length - 2]);
        }
        return result.toArray(new Integer[0]);
    }
}
