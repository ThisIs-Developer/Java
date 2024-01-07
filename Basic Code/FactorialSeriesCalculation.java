import java.util.*;

class Number {
    int n;

    public Number(int nn) {
        n = nn;
    }

    public int factorial(int a) {
        if (a <= 1)
            return 1;
        return a * factorial(--a);
    }

    public void display() {
        System.out.println("Number:" + n);
    }
}

class FactorialSeriesCalculation extends Number {
    int sum;

    public FactorialSeriesCalculation(int n) {
        super(n);
        sum = 0;
    }

    public void calcSum() {
        for (int i = 1; i <= n; i++) {
            sum += super.factorial(i);
        }
    }

    public void display() {
        super.display();
        System.out.println("sum" + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n0 = sc.nextInt();
        FactorialSeriesCalculation ob = new FactorialSeriesCalculation(n0);
        ob.calcSum();
        ob.display();
    }
}
