/*1. You are given a number n.
2. You've to create a pattern as shown in sample output.
eg, n=5
Sample Output

1												1	
1	2										2	1	
1	2	3								3	2	1	
1	2	3	4						4	3	2	1	
1	2	3	4	5				5	4	3	2	1	
1	2	3	4	5	6		6	5	4	3	2	1	
1	2	3	4	5	6	7	6	5	4	3	2	1	
*/
import java.util.*;

public class Pattern16 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int star = 1;
        int space = 2 * n - 3;
        for (int r = 0; r < n; r++) {
            int a = 0;
            for (int st = 1; st <= star; st++) {
                a++;
                System.out.print(a + "	");
            }
            for (int sp = 1; sp <= space; sp++) {
                System.out.print("	");
            }
            if (r == n - 1) {
                star--;
                a--;
            }
            for (int st = 1; st <= star; st++) {
                System.out.print(a + "	");
                a--;
            }
            System.out.println();
            star++;
            space -= 2;
        }
    }
}