
/*
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to add the numbers represented by two arrays and print the
arrays.
Input Format
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated
Output Format
A number representing sum of two numbers, represented by two arrays.

Constraints
1 <= n1, n2 <= 100
0 <= a1[i], a2[i] < 10
Sample Input
5
3
1
0
7
5
6
1
1
1
1
1
1
Sample Output
1
4
2
1
8
6

*/

import java.io.*;
import java.util.*;

public class SumOfTwoArrays {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }

        int max = (n1 >= n2) ? n1 : n2;
        int ans[]=new int[max+1];
        int carry=0,sum=0;
        
        int i=a1.length-1;
        int j=a2.length-1; 
        int k=ans.length-1;
        
        
        while(i>=0 || j>=0 || k>=0)
        {
            sum=0;
            if(i>=0)
                sum=sum+a1[i];
            if(j>=0)
                sum=sum+a2[j];
            
            sum=sum+carry;  
            
            ans[k]=(sum%10);
            carry=sum/10;
            
            i--;j--;k--;
            
        }
        if(ans[0]!=0)
            System.out.println(ans[0]);
        for(int x=1;x<ans.length;x++){
            System.out.println(ans[x]);
        }
        
    }

}