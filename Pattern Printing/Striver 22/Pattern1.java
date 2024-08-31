/*
 * Problem statement
Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.

For every value of ‘N’, help sam to print the corresponding N-dimensional forest.

Example:
Input: ‘N’ = 3

Output: 
* * *
* * *
* * *
 */

import java.util.*;

public class Pattern1{
    public static void main(String[] args) {
        int N = 3;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}