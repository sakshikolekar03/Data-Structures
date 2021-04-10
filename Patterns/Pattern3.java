/*1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
eg, n=5
o/p=
				*	
			*	*	
		*	*	*	
	*	*	*	*	
*	*	*	*	*	

*/
import java.util.*;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int spc=n-1;
        int str=1;
        
for(int i=0;i<n;i++)
{
    for(int j=spc;j>=1;j--)
        System.out.print("	");
        
        spc--;
    for(int k=0;k<str;k++)
        System.out.print("*	");
        str++;
    System.out.println();
}
    }
}
