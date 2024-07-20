package Recursion;

import java.util.Scanner;

public class ReverseNumber {
    static int sum = 0;

    public static void reverseNumber(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseNumber(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        reverseNumber(n);
        System.out.println("Reverse number = " + sum);
    }
}
