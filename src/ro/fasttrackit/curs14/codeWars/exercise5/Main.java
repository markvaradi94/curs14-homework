package ro.fasttrackit.curs14.codeWars.exercise5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(CountIPAddresses.ipsBetween("10.0.0.0", "20.0.0.50"));
    }

    static class Solution {
        public String rangeExtraction(int[] arr) {
            List<Integer> rangeEnds = new ArrayList<>();
            List<Integer> arrayNumbers = new ArrayList<>();
            for (int value : arr) {
                arrayNumbers.add(value);
            }
            for (int i = 0; i < arrayNumbers.size() - 1; i++) {
                if (!isConsecutive(arrayNumbers.get(i), arrayNumbers.get(i + 1))) {
                    rangeEnds.add(arrayNumbers.get(i));
                }
            }
            List<String> rangeStrings = new ArrayList<>();


            System.out.println("rangeEnds = " + rangeEnds);
            System.out.println();
            System.out.println("rangeStrings = " + rangeStrings);
            return null;
        }

        public boolean isConsecutive(int a, int b) {
            return b - a == 1;
        }

        public int findPositionInArray(int[] arr, int number) {
            int position = Arrays.binarySearch(arr, number);
            return (position < 0) ? -1 : position;
        }

    }
}
