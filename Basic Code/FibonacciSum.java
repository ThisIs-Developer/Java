import java.io.*;

public class FibonacciSum {
    public static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("NUMBER OF FIBO. TERMS = ");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Sum of the first " + n + " Fibonacci terms: " + fibonacciSum(n));
    }

    public static int fibonacciSum(int n) {
        if (n <= 0) return 0;
        int sum = 0;
        int fibo1 = 0, fibo2 = 1;
        
        for (int i = 1; i <= n; i++) {
            sum += fibo1;
            int next = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = next;
        }
        return sum;
    }
}
