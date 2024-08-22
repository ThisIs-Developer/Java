public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            sum = i + sum;
        }
        System.out.println("sum using for : " + sum);

        int i = 1;
        sum = 0;
        while (i <= 4) {
            sum += i;
            i++;
        }
        System.out.println("sum using while : " + sum);
    }
}
