import java.io.*;

class Fibonacci {
    static int fib(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fib(n - 1) + fib(n - 2);
    }

    public static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Number of Fibonacci terms: ");
        int n = Integer.parseInt(br.readLine());
        System.out.println(fib(n));
    }
}
