
/**
 
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.

Asssumption - Array is sorted. Array may have duplicate values.
Input Format
A number n
n1
n2
.. n number of elements
A number d
Output Format
A number representing first index
A number representing last index
Question Video


Constraints
1 <= n <= 1000
1 <= n1, n2, .. n elements <= 100
1 <= d <= 100
Sample Input
15
1
5
10
15
22
33
33
33
33
33
40
42
55
66
77
33
Sample Output
5
9
 */
import java.io.*;
import java.util.*;

public class FirstnLastIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int d=sc.nextInt();
        int fidx=-1;
        int lidx=fidx;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]==d && fidx==-1)
            {
                fidx=i;
                lidx=i;
            }
            else if(arr[i]==d )
            {
                lidx=i;
            }
        }
        System.out.println(fidx+"
"+lidx);
            
    }

}