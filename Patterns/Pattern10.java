/*1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.
eg, n=5
Sample Output
		*	
	*		*	
*				*	
	*		*	
		*	
*/
import java.util.*;

public class Pattern10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        int spc = n / 2;
        int str = 1;
        boolean flg = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print("	");
            }
            for (int k = 0; k < str; k++) {
                if(k==0 || k== str-1)
                System.out.print("*	");
                else
                System.out.print("	");
            }
            
            System.out.println();
            if (i < (n / 2)) {
                spc--;
                str += 2;
            } else {
                spc++;
                str -= 2;
            }
        }

    }
}