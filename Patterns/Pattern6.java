/*1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
eg, n=5
o/p=
*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*	

*/

import java.util.*;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        
        int str=n/2+1;
        int spc=1;        
        // write ur code here
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<str;j++)
            {
                System.out.print("*	");
            }
            for(int k=0;k<spc;k++)
            {
                System.out.print("	");
            }
            for(int j=0;j<str;j++)
            {
                System.out.print("*	");
            }
            if(i<n/2)
            {
                str--;
                spc+=2;
            }
            else
            {
                str++;
                spc-=2;
            }
             System.out.println();
        }
    }
}
