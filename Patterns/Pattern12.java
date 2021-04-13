
/*1. You are given a number n.
2. You've to create a pattern as shown in sample output.
eg, n=5
Sample Output
0	
1	1	
2	3	5	
8	13	21	34	
55	89	144	233	377	
*/

import java.util.*;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
       int n = scn.nextInt();

    int fno=0,sno=1,tno=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                tno=fno+sno;
                System.out.print(fno + "	");
                fno=sno;
                sno=tno;
            }
            System.out.println();
        }

    }
}
