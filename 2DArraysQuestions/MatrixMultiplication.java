
/*
1. You are given a number n1, representing the number of rows of 1st matrix.
2. You are given a number m1, representing the number of columns of 1st matrix.
3. You are given n1*m1 numbers, representing elements of 2d array a1.
4. You are given a number n2, representing the number of rows of 2nd matrix.
5. You are given a number m2, representing the number of columns of 2nd matrix.
6. You are given n2*m2 numbers, representing elements of 2d array a2.
7. If the two arrays representing two matrices of dimensions n1 * m1 and n2 * m2 can be multiplied, display the contents of prd array as specified in output Format.
8. If the two arrays can't be multiplied, print "Invalid input".
Input Format
A number n1
A number m1
e11
e12..
e21
e22..
.. n1 * m1 number of elements of array a1
A number n2
A number m2
e11'
e12'..
e21'
e22'..
.. n2 * m2 number of elements of array a2
Output Format
e11' e12' e13' ..
e21' e22' e23' ..
.. elements of prd array


Constraints
1 <= n1 <= 10^2
1 <= m1 <= 10^2
-10^9 <= e11, e12, .. n1 * m1 elements <= 10^9
1 <= n2 <= 10^2
1 <= m2 <= 10^2
-10^9 <= e11', e12', .. n2 * m2 elements <= 10^9
Sample Input
2
3
10
0
0
0
20
0
3
4
1
0
1
0
0
1
1
2
1
1
0
0
Sample Output
10 0 10 0
0 20 20 40
*/

import java.io.*;
import java.util.*;

public class MatrixMultiplication {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int r1,c1,r2,c2;
        r1=sc.nextInt();
        c1=sc.nextInt();
        int a1[][]=new int[r1][c1];
         
         for(int i=0;i<r1;i++)
            for(int j=0;j<c1;j++)
                a1[i][j]=sc.nextInt();
                
        r2=sc.nextInt();
        c2=sc.nextInt();
        int a2[][]=new int[r2][c2];
         
         for(int i=0;i<r2;i++)
            for(int j=0;j<c2;j++)
                a2[i][j]=sc.nextInt();
                
        int ans[][]=new int[r1][c2];
        
        // multiplication
        /* multiplication is possible only if c1==r2
        ans matrix will have size of (r1,c2)
        */
        
        if(c1!=r2)
        {
            System.out.println("Invalid input");
            return;
        }
         for(int i=0;i<r1;i++)
            for(int j=0;j<c2;j++)
            {
               for (int k = 0; k < c1; k++) {
                    ans[i][j] += a1[i][k] * a2[k][j];
                }
            }
            
            
        //Print the matrix    
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(ans[i][j]+" ");
            } 
            System.out.println();
        }
            
    }

}