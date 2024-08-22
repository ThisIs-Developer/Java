import java.io.*;

public class RecursiveCalculation {
    public static void main(String[] args) throws IOException {
        RecursiveCalculation ob = new RecursiveCalculation();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER = ");
        int m = Integer.parseInt(br.readLine());
        System.out.println("ENTER 2nd NUMBER = ");
        int n = Integer.parseInt(br.readLine());
        int h, l;
        h = ob.hcf(m, n);
        System.out.println(h);
        l = ob.lcm(m, n);
        System.out.println(l);
    }

    int hcf(int a, int b) {
        if (a == 0)
            return b;
        else
            return hcf(b % a, a);
    }

    int lcm(int a, int b) {
        return ((a * b) / hcf(a, b));
    }
}
