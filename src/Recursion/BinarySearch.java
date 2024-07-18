package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array, int search, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (array[mid] == search) {
            return mid;
        }
        if (search > array[mid]) {
            return binarySearch(array, search, mid + 1, array.length);
        }
        return binarySearch(array, search, start, mid - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {5, 11, 23, 36, 42, 58, 84, 97};
        System.out.println("Array: " + Arrays.toString(array));
        System.out.print("Number to search: ");
        int search = sc.nextInt();
        System.out.println("Element found at index: " + binarySearch(array, search, 0, array.length));
    }
}
