import java.io.*;

public class FactorsAndFactorial {
    public static void main() throws IOException {
        FactorsAndFactorial obj = new FactorsAndFactorial();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER: ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("FACTORS: ");
        obj.displayFactors(num);
        System.out.println("FACTORIAL: " + obj.calculateFactorial(num));
    }

    public void displayFactors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i);
                if (i != num) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }

    public int calculateFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
