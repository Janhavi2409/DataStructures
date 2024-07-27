package Recursion;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else if (first[i] > second[j]) {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] right = mergeSort(Arrays.copyOfRange(array, 0, mid));
        int[] left = mergeSort(Arrays.copyOfRange(array, mid, array.length));

        return merge(right, left);
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 9, 7, 6, 10, 4, 8, 0, 3};
        System.out.println("Array before sorting: " + Arrays.toString(array));

        System.out.println("Array after sorting: " + Arrays.toString(mergeSort(array)));
    }
}
