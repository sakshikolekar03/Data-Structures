/*1. You are required to display the prime factorization of a number.
    2. Take as input a number n.
    3. Print all its prime factors from smallest to largest.*/
import java.util.*;

public class PrimeFactorization {

    public static void main(String[] args) {
        // write your code here  
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        int div=2;
		while(n!=1)
		{
		    if(n%div==0)
		    {
		        System.out.print(div+" ");
		        n=n/div;
		    }
		    else
		    div++;
		}
    }
}