/*1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to print all subsets of arr. Each subset should be
on separate line. For more clarity check out sample input and output.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
[Tab separated elements of subset]
..
All subsets
Question Video


Constraints
1 <= n <= 10
0 <= n1, n2, .. n elements <= 10^3
Sample Input
3
10
20
30
Sample Output
-	-	-	
-	-	30	
-	20	-	
-	20	30	
10	-	-	
10	-	30	
10	20	-	
10	20	30	
 */


import java.io.*;
import java.util.*;

public class SubsetOfArrays {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            
        //total subset= 2^n = total line/rows
        int limit=(int)Math.pow(2,n);
        for(int i=0;i<limit;i++)
        {
            int temp=i;
            String set="";
            for(int j=arr.length-1;j>=0;j--) //find bin of ith row //print arr[j] where bit ==1
            {
                int r=temp%2;
                temp=temp/2;
                if(r==0)
                {
                    set="-	"+ set;
                }
                else
                {
                    set=arr[j]+"	"+set;
                }
            }
            
            System.out.println(set);
        }
    }

}