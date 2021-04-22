/*1. You are given a number n.
2. You've to create a pattern as shown in sample output.
eg, n=5
Sample Output

*	*	*	*			*	
			*			*	
			*			*	
*	*	*	*	*	*	*	
*			*				
*			*				
*			*	*	*	*	
*/
import java.util.*;

public class Pattern19 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 && (j<=n/2 || j==n-1))
                System.out.print("*	");
                else if(i>0 && i<n/2 && (j==n/2 || j==n-1))
                System.out.print("*	");
                else if(i==n/2)
                System.out.print("*	");
                else if(i>n/2 && i<n-1 && (j==0 || j==n/2))
                System.out.print("*	");
                else if(i==n-1 &&(j==0||j>=n/2 || j==n-1))
                System.out.print("*	");
                else
                System.out.print("	");
            }
            System.out.println();
        }








      

    }
}