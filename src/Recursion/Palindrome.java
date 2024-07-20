package Recursion;

import java.util.Scanner;

public class Palindrome {
    static int sum = 0;

    public static int reverse(int n) {
        if (n == 0) {
            return n;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n / 10);
        return sum;
    }

    public static boolean isPalindrome(int n) {
        if (n == reverse(n)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Is Palindrome?: " + isPalindrome(n));
    }
}
