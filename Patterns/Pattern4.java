/*1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
eg, n=5
o/p=

*	*	*	*	*	
	*	*	*	*	
		*	*	*	
			*	*	
				*
*/

import java.util.*;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j>0;j--)
                System.out.print("	");
            for(int j=n-i;j>=1;j--)
                System.out.print("*	");
                
             System.out.println();
                
        }

    }
}