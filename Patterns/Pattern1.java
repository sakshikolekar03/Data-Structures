/*1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
output for n=5
*	
*	*	
*	*	*	
*	*	*	*	
*	*	*	*	*
 */
import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print("*	");
            System.out.println();
        }
    }
}