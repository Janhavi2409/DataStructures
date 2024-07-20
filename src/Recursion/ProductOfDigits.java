package Recursion;

import java.util.Scanner;

public class ProductOfDigits {

    public static int productOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) * productOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Product of digits = " + productOfDigits(n));
    }
}
