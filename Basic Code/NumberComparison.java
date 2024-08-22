import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("value of a : ");
        int a = sc.nextInt();
        System.out.print("value of b : ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }
    }
}
