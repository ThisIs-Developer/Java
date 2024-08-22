import java.util.*;

class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal, rate, and time:");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        int si1 = (p * r * t) / 100;
        int amt1 = p + si1;
        int si2 = (amt1 * r * t) / 100;
        int amt2 = amt1 + si2;
        int si3 = (amt2 * r * t) / 100;
        int amt3 = amt2 + si3;

        System.out.println("Interest for 1st year: " + si1 + ", Amount for 1st year: " + amt1);
        System.out.println("Interest for 2nd year: " + si2 + ", Amount for 2nd year: " + amt2);
        System.out.println("Interest for 3rd year: " + si3 + ", Amount for 3rd year: " + amt3);
    }
}
