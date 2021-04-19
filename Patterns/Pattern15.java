/*1. You are given a number n.
2. You've to create a pattern as shown in sample output.
eg, n=5
Sample Output
		1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	
*/
import java.util.*;

public class Pattern15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int star = 1;
        int space = n / 2;

        int
        var = 1;
        for (int r = 0; r < n; r++) {
            for (int sp = 1; sp <= space; sp++) {
                System.out.print("	");
            }
          
            int val =var;
            for (int st = 1; st <= star; st++) {
                System.out.print(val + "	");

                if (st <= star / 2) {
                    val++;
                } 
                else {
                    val--;
                }
            }
            System.out.println();
            if (r < n / 2) {
                var ++;
                space--;
                star += 2;
            } else {
                var --;
                space++;
                star -= 2;
            }
        }

    }
}