/*1. You are required to check if a given set of numbers is a valid pythagorean triplet.
2. Take as input three numbers a, b and c.
3. Print true if they can form a pythagorean triplet and false otherwise. */
import java.util.*;

public class PythagoreanTriplet {

    public static void main(String[] args) {
        // write your code here  
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        a=a*a;
        b=b*b;
        c=c*c;
        
            if(a==(b+c)||b==(a+c)||c==(a+b))
                System.out.println(true);
            else
                System.out.println(false);
        
    }
}