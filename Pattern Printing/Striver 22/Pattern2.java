/*
 * Problem statement
Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.

An N/2-dimensional forest is represented by the lower triangle of the pattern filled with ‘*’.

For every value of ‘N’, help sam to print the corresponding N/2-dimensional forest.

Example:
Input:  ‘N’ = 3

Output: 
* 
* *
* * *
 */

 public class Pattern2 {
    public static void nForest(int n) {
        // Write your code here
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}