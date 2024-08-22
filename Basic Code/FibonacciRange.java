import java.util.*;

class FibonacciRange {
    int start;
    int end;

    FibonacciRange() {
        start = 0;
        end = 0;
    }

    void readValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start and end values for the Fibonacci series:");
        start = sc.nextInt();
        end = sc.nextInt();
    }

    int fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return (fibonacci(n - 1) + fibonacci(n - 2));
    }

    void displayFibonacciSeries() {
        System.out.println("Fibonacci Series:");
        for (int i = start; ; i++) {
            if (fibonacci(i) > end) break;
            else System.out.println(fibonacci(i));
        }
    }

    public static void main(String[] args) {
        FibonacciRange fiboObj = new FibonacciRange();
        fiboObj.readValues();
        fiboObj.displayFibonacciSeries();
    }
}
