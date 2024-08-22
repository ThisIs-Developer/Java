import java.io.*;

public class VolumeCalculator {
    double VOLUME(double a) {
        return a * a * a;
    }

    double VOLUME1(double l, double b, double h) {
        return l * b * h;
    }

    double VOLUME2(double p, double r, double i) {
        return p * r * r * i;
    }

    public static void main(String[] args) throws IOException {
        VolumeCalculator ob = new VolumeCalculator();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("ENTER THE VALUE OF A = ");
        double a = Double.parseDouble(br.readLine());
        System.out.println("VOLUME = " + ob.VOLUME(a));

        System.out.println("ENTER THE VALUE OF L = ");
        double l = Double.parseDouble(br.readLine());
        System.out.println("ENTER THE VALUE OF B = ");
        double b = Double.parseDouble(br.readLine());
        System.out.println("ENTER THE VALUE OF H = ");
        double h = Double.parseDouble(br.readLine());
        System.out.println("VOLUME1 = " + ob.VOLUME1(l, b, h));

        System.out.println("ENTER THE VALUE OF P = ");
        double p = Double.parseDouble(br.readLine());
        System.out.println("ENTER THE VALUE OF R = ");
        double r = Double.parseDouble(br.readLine());
        System.out.println("ENTER THE VALUE OF I = ");
        double i = Double.parseDouble(br.readLine());
        System.out.println("VOLUME = " + ob.VOLUME2(p, r, i));
    }
}
