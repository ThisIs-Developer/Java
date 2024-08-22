// to find the largest among three numbers x,y, and z. 
// You should use if-then-else construct in Java.
import java.util.Scanner;;
public class largest_in3 
{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the first number : ");
            int x = s.nextInt(); 
            System.out.print("Enter the Second number : ");
            int y = s.nextInt();
            System.out.print("Enter the third number : ");
            int z = s.nextInt();
            int result = 0;
            if(x>=y && x>=z)
            {
                System.out.println("Largest no is : First Number");
                result=x;
            }
            else if(y>=x && y>=z)
            {
                System.out.println("Largest no is : Second Number");
                result=y;
            }   
            else
                System.out.println("Largest no is : Third Number");
                result=z;
            
            System.out.println("Number : "+result);
        }
    }
}
