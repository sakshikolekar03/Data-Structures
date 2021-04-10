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

public class pattern2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=01;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("*	");
            }
            System.out.println();
        }

    }
}