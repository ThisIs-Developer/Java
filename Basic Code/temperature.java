// Write a program that Convert celsius input from user to Fahrenheit
import java.util.Scanner;
public class temperature {
    public static void main(String[] args) throws Exception
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter temp. in C");
            double c=sc.nextDouble();
            final double f=((c*9)/5)+32;
            System.out.println("temp. in F "+f);
    
            if(f>98.6)
            System.out.println("FEVER");
            else
            System.out.println("no fever");
        }
    }
}