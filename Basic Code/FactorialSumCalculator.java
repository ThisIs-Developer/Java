import java.util.*;

public class FactorialSumCalculator {
    int n;

    FactorialSumCalculator(int nn) {
        n = nn;
    }

    public int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public void display() {
        System.out.println("Number=" + n);
    }
}

class Series extends FactorialSumCalculator {
    int sum;

    Series(int nn) {
        super(nn); // Call superclass constructor with nn argument
        sum = 0;
    }

    void calcSum() {
        for (int i = 1; i <= n; i++) {
            sum = sum + super.factorial(i);
        }
    }

    public void display() {
        System.out.println("Sum:" + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        Series ob = new Series(input); // Pass input as argument to the Series constructor
        ob.calcSum();
        ob.display();
    }
}
