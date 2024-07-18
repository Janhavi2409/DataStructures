package Recursion;

import java.util.Scanner;

//0 1 1 2 3 5 8
public class FibonacciNumber {

    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number: " + fibonacci(n));
    }
}
