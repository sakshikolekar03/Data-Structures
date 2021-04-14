/*1. You are given a number n.
2. You've to create a pattern as shown in sample output.
eg, n=5
Sample Output
1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1
*/
import java.util.*;
public class Pattern13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //write your code here
        int n=scn.nextInt();
        
        
        int ncr=1;
        for(int i=0;i<n;i++)
        {
            ncr=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(ncr+"	");
                ncr=ncr *(i-j)/(j+1);
            }
            
                System.out.println();
        }

    }
}