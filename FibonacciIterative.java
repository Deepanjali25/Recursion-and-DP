package Practice.RecursionandDynamicProgramming;
import java.util.Scanner;
class FibonacciIterative {
    public static int fibo(int n) {
        if (n < 0)
            return -1; // Error condition.
        if (n == 0)
            return 0;
        int a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibo(n));
        System.out.println(fibo(24));
    }
}
