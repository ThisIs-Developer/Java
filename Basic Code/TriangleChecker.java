import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first angle:");
        int a = sc.nextInt();
        System.out.println("Enter the second angle:");
        int b = sc.nextInt();
        System.out.println("Enter the third angle:");
        int c = sc.nextInt();

        int sum = a + b + c;
        if (sum == 180)
            System.out.println("Triangle is possible as the sum is " + sum);
        else
            System.out.println("Triangle is not possible as the sum is " + sum);
    }
}
