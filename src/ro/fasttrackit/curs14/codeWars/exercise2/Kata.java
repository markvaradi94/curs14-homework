package ro.fasttrackit.curs14.codeWars.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Kata {
    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        if (arrayOfArrays == null || arrayOfArrays.length == 0) {
            return 0;
        }
        for (Object[] array : arrayOfArrays) {
            if (array == null || array.length == 0) {
                return 0;
            }
        }
        List<Integer> lengths = matrixLengths(arrayOfArrays);
        Collections.sort(lengths);
        for (int i = 0; i < lengths.size() - 1; i++) {
            if (lengths.get(i + 1) - lengths.get(i) > 1) {
                return lengths.get(i) + 1;
            }
        }
        return 0;
    }

    public static List<Integer> matrixLengths(Object[][] arrayOfArrays) {
        List<Integer> lengths = new ArrayList<>();
        for (Object[] objects : arrayOfArrays) {
            lengths.add(objects.length);
        }
        return lengths;
    }

    public static int getLengthOfMissingArray2(Object[][] arrayOfArrays)
    {
        if (arrayOfArrays == null || arrayOfArrays.length == 0)
            return 0;
        for (Object[] arr : arrayOfArrays) {
            if (arr == null || arr.length == 0)  return 0;
        }

        Integer[] arr = Arrays.asList(arrayOfArrays).stream()
                .map( el -> el.length)
                .sorted()
                .toArray(Integer[]::new);

        int currentSum = Arrays.asList(arr).stream().reduce(0,(a,b) -> a+b);
        int fullSum = IntStream.rangeClosed(arr[0], arr[arr.length-1]).sum();


        return fullSum - currentSum;

    }
}
