import java.io.*;

public class GeometryCalculator {
    int square(int a) {
        return a * a;
    }

    int rectangle(int l, int b) {
        return l * b;
    }

    double circle(int r) {
        double pi, area;
        pi = 3.14;
        area = pi * r * r;
        return area;
    }

    public static void main() throws IOException {
        GeometryCalculator obj = new GeometryCalculator();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("SIDE OF SQUARE = ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("AREA = " + obj.square(a));

        System.out.println("Length of L = ");
        int l = Integer.parseInt(br.readLine());
        System.out.println("Length of B = ");
        int b = Integer.parseInt(br.readLine());
        System.out.println("AREA = " + obj.rectangle(l, b));

        System.out.println("Enter the radius of CIRCLE =");
        int r = Integer.parseInt(br.readLine());
        System.out.println("AREA OF THE CIRCLE = " + obj.circle(r));
    }
}
