
/*1. You are given a number n.
2. You've to create a pattern as shown in sample output.
eg, n=5
Sample Output

*	*	*	*	*	*	*	
	*				*	
		*		*	
			*	
		*	*	*	
	*	*	*	*	*	
*	*	*	*	*	*	*	
*/
import java.util.*;

public class Pattern18 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        int spc = 0;
        int str = n;
        boolean flg = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spc; j++) {
                
                System.out.print("	");
            }
            for (int k = 0; k < str; k++) {
                if((i>0 && i< n/2) && (k>0 && k<str-1))
                System.out.print("	");
                else
                System.out.print("*	");
            }
            
            System.out.println();
            if (i >= (n / 2)) {
                spc--;
                str += 2;
            } else {
                spc++;
                str -= 2;
            }
        }

    }
}