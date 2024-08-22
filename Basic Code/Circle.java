// to find the perimeter and area of a circle given a value of radius.
// You should use Math.PI constant in your program. If radius is zero or less than zero then print " please enter non zero positive number ".
import java.util.Scanner;
public class Circle 
{
    public static void main(String[] args) 
    {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the Radius of the circle : ");
            double radius= s.nextDouble();
            double perimeter;
            double area;
            if(radius!=0 && radius>=0)
            {
                perimeter = 2*Math.PI*radius;
                area = Math.PI * radius* radius;
                System.out.println("Permetr of Circlr : "+perimeter);
                System.out.print("Area of Circlr : "+area);
            }
            else
            System.out.println("please enter non zero positive number");
        }
    }
}
