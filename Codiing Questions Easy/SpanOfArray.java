/*1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value. */

import java.io.*;
import java.util.*;

public class SpanOfArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int val=sc.nextInt();
            if(val>max)
                max=val;
            if(val<min)
                min=val;
        }
        System.out.println(max-min);
    }

}