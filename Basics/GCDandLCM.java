/*1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
3. Take input "num1" and "num2" as the two numbers.
4. Print their GCD and LCM.*/
import java.util.*;

public class GCDandLCM {

    public static void main(String[] args) {
        // write your code here  

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int gcd = 0, lcm = 0;

        if (n1 % n2 == 0 || n2 % n1 == 0)
            gcd = (n1 < n2) ? n1 : n2;
        else {
             //System.out.println("hi");
            int i = (n1 < n2) ? n1 : n2;
            i--;
            
            while (i > 0) {
                if (n1 % i == 0 && n2 % i == 0) {
                    gcd = i;
                    break;
                    //System.out.println(gcd);
                } 
                    i--;
            }
        }

        if (gcd > 0)
            lcm = (n1 * n2) / gcd;

        System.out.println(gcd + " " + lcm);
    }
}