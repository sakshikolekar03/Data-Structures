/*1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
eg, n=5
Sample Output
*				*	
	*		*		
		*			
	*		*		
*				*	

*/

import java.util.*;

public class Pattern9 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int str1 = 0, str2 = n - 1;
        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) 
                if (i==j || (i+j)==(n-1))
                    System.out.print("*	");
                else
                    System.out.print("	");
            
            System.out.println();
        }

    }
}