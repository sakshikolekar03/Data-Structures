/*
1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.

Input & Output:
A number n
A digit d
*/

import java.util.*;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        
        
        int rem=0,cnt=0;
        while(n>0)
        {
            rem=n%10;
            if(rem==d)
            cnt++;
            n=n/10;
        }
        return cnt;
    }
}