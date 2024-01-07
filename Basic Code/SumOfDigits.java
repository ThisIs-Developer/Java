import java.io.*;

public class SumOfDigits {
    public static void main() throws IOException {
        SumOfDigits obj = new SumOfDigits();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER: ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("SUM OF DIGITS = " + obj.sumOfDigits(num));
        if (obj.factorCheck(num) == 1) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }

    public int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    public int factorCheck(int num) {
        int fact = 0;
        int sum = sumOfDigits(num);
        int factorial = 1;

        for (int i = 1; i <= sum; i++) {
            factorial *= i;
        }

        if (sum == factorial) {
            fact = 1;
        }

        return fact;
    }
}
