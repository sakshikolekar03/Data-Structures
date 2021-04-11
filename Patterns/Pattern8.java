/*1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
eg, n=5
o/p=
				*	
			*		
		*			
	*				
*
*/

import java.util.*;

public class Pattern8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i; j--)
                System.out.print("	");
            System.out.print("*");
            System.out.println();
        }

    }
}