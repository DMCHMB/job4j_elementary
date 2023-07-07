package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex < rightIndex) {
            if (target == array[leftIndex] + array[rightIndex]) {
                return new int[]{leftIndex, rightIndex};
            } else if (target > array[leftIndex] + array[rightIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }
        return new int[0];
    }
}
