package Practice.RecursionandDynamicProgramming;
import java.util.Scanner;
class FibonacciRecursion{
    public static int fibo(int n) {
        return fibo(n, new int[n + 1]);
    }
    public static int fibo(int i, int[] memo) {
        if (i == 0 || i == 1) {
            return i;
        }
        if (memo[i] == 0) {
            memo[i] = fibo(i - 1, memo)+ fibo(i - 2, memo);
        }
        return memo[i];
    }
    //public static int fibo(int n) {
            //if(n == 0) {
                //return 0;
            //} else if (n == 1) {
                //return 1;
            //} else if (n > 1) {
                //return fibo(n-1) + fibo(n-2);// f(n) = f(n—1) + f(n-2)
            //}
            //else {
               //return -1;
            //}
    //}
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibo(n));
    }
}