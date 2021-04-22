/*1. You are given a number n.
2. You've to create a pattern as shown in sample output.
eg, n=5
Sample Output

		*	
		*	*	
*	*	*	*	*	
		*	*	
		*	
*/
import java.util.*;

public class Pattern17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        int spc = n / 2;
        int str = 1;
        boolean flg = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spc; j++) {
                if(i== n/2)
                System.out.print("*	");
                else
                System.out.print("	");
            }
            for (int k = 0; k < str; k++) {
                System.out.print("*	");
            }
            
            System.out.println();
            if (i < (n / 2)) {
                spc=n/2;
                str += 1;
            } else {
                spc=n/2;
                str -= 1;
            }
        }

    }
}